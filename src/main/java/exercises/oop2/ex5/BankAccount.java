package exercises.oop2.ex5;

public class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value <= 0) {
            System.out.println("Cannot deposit zero or negative values.");
            return;
        }
        this.balance += value;
    }

    public double getBalance() {
        return balance;
    }
}
