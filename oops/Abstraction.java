package oops;

// Definition: Abstraction is an OOP concept that hides implementation details and shows only the essential features to the user.
// Real-life example: When you make a payment using Google Pay, you enter the amount and pay. You do not need to know all the internal processing steps.


abstract class PaymentGateway {

    void printReceipt() {
        System.out.println("Receipt printed.");
    }

    abstract void processPayment(double amount);
}

class UpiPayment extends PaymentGateway {

    @Override
    void processPayment(double amount) {
        System.out.println(
            "Processing UPI payment of amount: " + amount
        );
    }
}

class CreditCardPayment extends PaymentGateway {

    @Override
    void processPayment(double amount) {
        System.out.println(
            "Processing credit card payment of amount: " + amount
        );
    }
}

public class Abstraction {

    public static void main(String[] args) {

        PaymentGateway payment1 = new UpiPayment();
        payment1.processPayment(1000.0);
        payment1.printReceipt();

        System.out.println();

        PaymentGateway payment2 = new CreditCardPayment();
        payment2.processPayment(2000.0);
        payment2.printReceipt();
    }
}
