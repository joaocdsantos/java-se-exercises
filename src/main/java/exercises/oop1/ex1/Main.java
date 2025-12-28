package exercises.oop1.ex1;

/**
 * Create a BankAccount class with:
 * Private properties: owner, balance
 * Public methods:
 *  - deposit(double amount)
 *  - withdraw(double amount)
 *  - getBalance() (read-only)
 * Tasks:
 * 1. Prevent negative balance.
 * 2. Validate operations with negative amounts.
 * 3. Test in a main() by creating 2 different accounts.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("João Santos", 50);
        BankAccount account2 = new BankAccount("Maria Soares", 100);


        // ACCOUNT 1
        System.out.println("=== ACCOUNT 1 ===");
        System.out.println("Owner: " + account1.getOwner());
        System.out.printf("Balance: %.2f€%n", account1.getBalance());

        System.out.println("\n-- Withdraw 100 --");
        account1.withdraw(100);
        System.out.printf("Balance: %.2f€%n", account1.getBalance());

        System.out.println("\n-- Withdraw 20 --");
        account1.withdraw(20);
        System.out.printf("Balance: %.2f€%n", account1.getBalance());

        System.out.println("\n-- Withdraw -20 negative --");
        account1.withdraw(-20);
        System.out.printf("Balance: %.2f€%n", account1.getBalance());

        System.out.println("\n-- Deposit 100 --");
        account1.deposit(100);
        System.out.printf("Balance: %.2f€%n", account1.getBalance());

        System.out.println("\n-- Deposit -20 negative --");
        account1.deposit(-20);
        System.out.printf("Balance: %.2f€%n", account1.getBalance());

        System.out.println("\n========================\n");

        // ACCOUNT 2
        System.out.println("=== ACCOUNT 2 ===");
        System.out.println("Owner: " + account2.getOwner());
        System.out.println("Balance: " + account2.getBalance());
    }
}
