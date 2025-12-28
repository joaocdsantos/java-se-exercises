package exercises.oop2.ex5;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double saldo) {
        super(saldo);
    }

    public void interest() {
        super.balance *= 1.05;
    }
}
