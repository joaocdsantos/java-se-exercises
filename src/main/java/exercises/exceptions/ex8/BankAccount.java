package exercises.exceptions.ex8;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance ) {
            throw new InsufficientBalanceException("Insufficient balance to complete this operation.");
        }
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}
