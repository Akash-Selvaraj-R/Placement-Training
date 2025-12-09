abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }
    abstract void makePayment();
    void generateReceipt() {
        System.out.println("Receipt generated for " + amount);
    }
}
class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Paying " + amount + " using Credit Card...");
    }
}
class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Paying " + amount + " using UPI...");
    }
}
public class BankPaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(500.00);
        p1.makePayment();
        p1.generateReceipt();

        System.out.println();

        Payment p2 = new UPIPayment(300.00);
        p2.makePayment();
        p2.generateReceipt();
    }
}

/*
output:
Paying 500.0 using Credit Card...
Receipt generated for 500.0
Paying 300.0 using UPI...
Receipt generated for 300.0
*/