
import java.util.Scanner;

public class costTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double costTicket = 300;

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");

        } else if (age < 5) {
            System.out.println("The ticket is free");

        } else if (age >= 5 && age <= 12) {
            double finalCost = costTicket * 0.5;

            System.out.println("You are a minor, 50% discount");
            System.out.println("Ticket cost is Rs. " + finalCost);

        } else if (age >= 13 && age <= 60) {
            System.out.println("You are an adult, no discount");
            System.out.println("Ticket cost is Rs. " + costTicket);

        } else {
            double finalCost = costTicket * 0.75;

            System.out.println("You are a senior citizen, 25% discount");
            System.out.println("Ticket cost is Rs. " + finalCost);
        }

        sc.close();
    }
}
