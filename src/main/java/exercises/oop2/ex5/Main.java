package exercises.oop2.ex5;

/**
 * 5. Exercise – Inheritance + Protected
 * -----------------------------------------
 * Create:
 * BankAccount
 *  - protected balance
 *  - deposit(double value)
 *  - getBalance()
 * -----------------------------------------
 * Subclass:
 * SavingsAccount
 *  - interest() → increases balance by 5%
 * -----------------------------------------
 * In main, create a SavingsAccount, deposit a value and apply interest.
 * -----------------------------------------
 * Goal: understand the use of the protected modifier in inheritance.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. Create Savings Account with 1000 ===");
        SavingsAccount savings = new SavingsAccount(1000);
        System.out.printf("Balance: %.2f€%n", savings.getBalance());

        System.out.println("\n=== 2. Deposit 1000 ===");
        savings.deposit(1000);
        System.out.printf("Balance: %.2f€%n", savings.getBalance());

        System.out.println("\n=== 3. Apply Interest ===");
        savings.interest();
        System.out.printf("Final Balance: %.2f€%n", savings.getBalance());
    }
}
