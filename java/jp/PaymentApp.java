import java.util.Scanner;

public class PaymentApp {

    interface PaymentMethod {
        void pay(double amount);
    }

    static class UPI implements PaymentMethod {
        private String upiId;
        private boolean isSaved = false;

        @Override
        public void pay(double amount) {
            Scanner sc = new Scanner(System.in);

            if (!isSaved) {
                System.out.println("\nUPI Payment");
                System.out.print("Enter UPI ID (e.g. name@oksbi): ");
                this.upiId = sc.nextLine();
                System.out.println("UPI ID saved for future payments!");
                isSaved = true;
            } else {
                System.out.println("\nUsing saved UPI: " + upiId);
            }

            System.out.print("Enter 4-digit UPI PIN: ");
            int pin = sc.nextInt();

            System.out.println("Processing...");
            System.out.println("Paid ₹" + amount + " using UPI");
            System.out.println("Transaction ID: TXN" + System.currentTimeMillis());
        }
    }

    static class Card implements PaymentMethod {
        @Override
        public void pay(double amount) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nCard Payment");
            System.out.print("Enter 16-digit card number: ");
            String cardNo = sc.nextLine();

            System.out.print("Enter expiry (MM/YY): ");
            String expiry = sc.nextLine();

            System.out.print("Enter CVV: ");
            sc.nextInt();

            System.out.println("Contacting bank...");
            System.out.println("Paid ₹" + amount + " successfully!");
            System.out.println("Transaction ID: CRD" + System.currentTimeMillis());
        }
    }


    static class Wallet implements PaymentMethod {
        private double balance = 5000.00;

        @Override
        public void pay(double amount) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nWallet Payment");
            System.out.println("Current balance: ₹" + balance);

            if (amount > balance) {
                System.out.println("Insufficient balance!");
                return;
            }

            System.out.print("Enter 4-digit PIN: ");
            sc.nextInt();

            balance -= amount;

            System.out.println("Paid ₹" + amount + " from wallet");
            System.out.println("Remaining balance: ₹" + balance);
            System.out.println("Transaction ID: WAL" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== EasyPay ===");
        System.out.print("Enter amount: ₹");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nSelect payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Wallet");
        System.out.print("Choose (1-3): ");
        int choice = sc.nextInt();

        PaymentMethod method = null;

        if (choice == 1) method = new UPI();
        else if (choice == 2) method = new Card();
        else if (choice == 3) method = new Wallet();
        else {
            System.out.println("Invalid choice!");
            return;
        }

        method.pay(amount);

        System.out.println("\nThank you for using EasyPay!");
    }
}