package exercises.exceptions.ex8;

 /**
 * Exercise – Bank Account: Withdraw Money
 * ------------------------
 * Create a class BankAccount with:
 * - balance
 * - withdraw(double amount) → if amount > balance, throw InsufficientBalanceException
 * - deposit(double amount)
 * Test in main using try/catch.
 * ------------------------
 * Goal: exceptions + classes + simple business logic.
 */
public class Main {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(200.00);
        System.out.println("Created bank account with 200.00€");

        try {
            bankAccount.deposit(100.00);
            System.out.println("\n➡ Deposit: 100.00€");
            System.out.printf("Current balance: %.2f€%n", bankAccount.getBalance());

            bankAccount.withdraw(200.00);
            System.out.println("\n➡ Withdraw: 200.00€");
            System.out.printf("Current balance: %.2f€%n", bankAccount.getBalance());


            System.out.println("\nAttempting to withdraw +200.00€ ...");
            bankAccount.withdraw(200.00);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
