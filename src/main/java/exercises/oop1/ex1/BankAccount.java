package exercises.oop1.ex1;

public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + "€ completed.");
        } else {
            System.out.println("Invalid deposit (value must be positive).");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal (value must be positive).");
        } else {
            if (amount > balance) {
                System.out.println("Not enough funds.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + "€ completed.");
            }
        }
    }

    @Override
    public String toString() {
        return "Account Owner: " + owner + " | Balance: " + balance + "€";
    }
}