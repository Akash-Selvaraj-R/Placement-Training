//Question 2: Bank Account with Balance Security

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Controlled deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Controlled withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient Balance!!");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Remaining Balance: " + acc.getBalance());
    }
}

//Output:
// Deposited: 500.0
// Withdrew: 300.0
// Remaining Balance: 1200.0
