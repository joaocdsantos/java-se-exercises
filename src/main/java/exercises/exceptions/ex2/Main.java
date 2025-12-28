package exercises.exceptions.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exercise – Valid Integer Input
 * ------------------------
 * Ask the user to enter an integer number.
 * If the user types something invalid (e.g., letters), catch the InputMismatchException
 * and ask again until a valid value is entered.
 * ------------------------
 * Goal: Loop + Scanner exception handling.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        do {
            try {
                System.out.print("Enter an integer number: ");
                int value = scanner.nextInt();
                System.out.println("You entered a valid integer: " + value);
                menu = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input — Only integer numbers are allowed. Try again.\n");
                scanner.nextLine();
            }
        } while (menu);

        scanner.close();
    }
}
