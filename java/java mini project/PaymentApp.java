/*
Mini project – Payment Interface (UPI/Card/Wallet)
Create a Project for the Payment Interface
You must use the OOP methodology while implementing the different payment methods, e.g. Interface, Polymorphism, abstraction etc.

Note:
Variable, class, Interface or Methods naming must follow the java standards and must be logical

*/

/*
 * Payment Interface Mini Project
 * Demonstrates OOP concepts: Interface, Polymorphism, Abstraction, Encapsulation
 * Supports UPI, Card, and Wallet payments
 */

// PaymentApp.java  → One file only (Simple + Real Steps)

import java.util.Scanner;

public class PaymentApp {

    interface Payment {
        void process(double amount);
    }

    // 1. UPI Payment (Real Steps)
    static class UPIPayment implements Payment {
        public void process(double amount) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nUPI Payment Selected");
            System.out.print("Enter your UPI ID (example: yourname@upi): ");
            String upiId = sc.nextLine();

            System.out.println("Sending payment request to " + upiId + "...");
            System.out.print("Enter UPI PIN (4 digits): ");
            int pin = sc.nextInt();

            System.out.println("Verifying PIN...");
            System.out.println("Payment of ₹" + amount + " Successful via UPI!");
            System.out.println("Transaction ID: UPI" + System.currentTimeMillis());
        }
    }

    // 2. Card Payment (Real Steps)
    static class CardPayment implements Payment {
        public void process(double amount) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nCard Payment Selected");
            System.out.print("Enter 16-digit Card Number: ");
            String cardNo = sc.nextLine();

            System.out.print("Enter Expiry Date (MM/YY): ");
            String expiry = sc.nextLine();

            System.out.print("Enter CVV (3 digits): ");
            int cvv = sc.nextInt();

            System.out.println("Contacting bank...");
            System.out.println("Payment of ₹" + amount + " Successful via Card!");
            System.out.println("Transaction ID: CRD" + System.currentTimeMillis());
        }
    }

    // 3. Wallet Payment (Real Steps)
    static class WalletPayment implements Payment {
        public void process(double amount) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nWallet Payment Selected");
            System.out.print("Enter Registered Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.print("Enter 4-digit Wallet PIN: ");
            int pin = sc.nextInt();

            System.out.println("Checking balance...");
            System.out.println("Payment of ₹" + amount + " Successful from Wallet!");
            System.out.println("Remaining Balance: ₹3500.00");
            System.out.println("Transaction ID: WAL" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to EasyPay");
        System.out.print("Enter Amount to Pay: ₹");
        double amount = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit/Debit Card");
        System.out.println("3. Wallet");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine();

        Payment payment = null;

        if (choice == 1) {
            payment = new UPIPayment();
        } else if (choice == 2) {
            payment = new CardPayment();
        } else if (choice == 3) {
            payment = new WalletPayment();
        } else {
            System.out.println("Invalid option! Try again.");
            return;
        }

        // This one line works for all 3 methods → Polymorphism
        payment.process(amount);

        System.out.println("\nThank You! Visit Again");
    }
}