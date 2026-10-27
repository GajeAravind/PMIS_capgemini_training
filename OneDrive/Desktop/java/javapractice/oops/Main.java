package oops;


import java.util.ArrayList;
import java.util.List;

// 1. Interface
interface Rentable {
    double calculateRent(int days);
    boolean isAvailable();
}

// 2. Abstract class
abstract class Vehicle implements Rentable {
    private final String id;
    private final String model;
    private final double dailyRate;
    private boolean available = true;

    public Vehicle(String id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String displayName() {
        return getClass().getSimpleName() + " "
                + model + " (" + id + ")";
    }
}

// 3. Car
class Car extends Vehicle {
    public Car(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        return getDailyRate() * days;
    }
}

// 4. Bike
class Bike extends Vehicle {
    public Bike(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        double total = getDailyRate() * days;

        if (days >= 7) {
            total = total * 0.90;
        }

        return total;
    }
}

// 5. Truck
class Truck extends Vehicle {
    private static final double INSURANCE_CHARGE = 500.0;

    public Truck(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        return getDailyRate() * days + INSURANCE_CHARGE;
    }
}

// 6. Rental
class Rental {
    private final Vehicle vehicle;
    private final Customer customer;
    private final int days;
    private final double totalCost;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Days must be greater than zero");
        }

        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = vehicle.calculateRent(days);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getTotalCost() {
        return totalCost;
    }
}

// 7. Customer
class Customer {
    private final String name;
    private final List<Rental> rentalHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentalHistory.add(rental);
    }

    public List<Rental> getRentalHistory() {
        return new ArrayList<>(rentalHistory);
    }
}

// 8. Custom exception
class VehicleRentalException extends Exception {
    public VehicleRentalException(String message) {
        super(message);
    }
}

// 9. RentalShop
class RentalShop {
    private final List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days)
            throws VehicleRentalException {

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            throw new VehicleRentalException(
                    "Vehicle with ID " + vehicleId + " was not found");
        }

        if (!vehicle.isAvailable()) {
            throw new VehicleRentalException(
                    vehicle.displayName() + " is already rented");
        }

        Rental rental = new Rental(vehicle, customer, days);

        vehicle.setAvailable(false);
        customer.addRental(rental);

        return rental;
    }

    public void giveBack(String vehicleId)
            throws VehicleRentalException {

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            throw new VehicleRentalException(
                    "Vehicle with ID " + vehicleId + " was not found");
        }

        if (vehicle.isAvailable()) {
            throw new VehicleRentalException(
                    vehicle.displayName() + " is not currently rented");
        }

        vehicle.setAvailable(true);
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle.displayName());
            }
        }
    }

    private Vehicle findVehicle(String id) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                return vehicle;
            }
        }

        return null;
    }
}

// 10. Main class
public class Main {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        shop.addVehicle(new Car("C1", "Swift", 2000));
        shop.addVehicle(new Bike("B1", "Activa", 400));
        shop.addVehicle(new Truck("T1", "Tata Ace", 2500));

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            Rental bikeRental = shop.rent("B1", asha, 8);

            System.out.printf(
                    "%s rented %s for %d days = %.2f%n",
                    asha.getName(),
                    bikeRental.getVehicle().displayName(),
                    bikeRental.getDays(),
                    bikeRental.getTotalCost());

            Rental truckRental = shop.rent("T1", ravi, 2);

            System.out.printf(
                    "%s rented %s for %d days = %.2f%n",
                    ravi.getName(),
                    truckRental.getVehicle().displayName(),
                    truckRental.getDays(),
                    truckRental.getTotalCost());

            // Try to rent the same bike again
            try {
                shop.rent("B1", ravi, 3);
            } catch (VehicleRentalException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Return the truck
            shop.giveBack("T1");

            shop.showAvailable();

        } catch (VehicleRentalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

