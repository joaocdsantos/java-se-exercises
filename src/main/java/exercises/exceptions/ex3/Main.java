package exercises.exceptions.ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exercise – Array Index Control
 * ------------------------
 * Create an array with 5 positions.
 * Ask the user for an index and print the element at that position.
 * Handle ArrayIndexOutOfBoundsException if the index is invalid.
 * ------------------------
 * Goal: Exception handling when accessing arrays.
 */
public class Main {

    public static void main(String[] args) {

        String[] array = {
                "Position 1",
                "Position 2",
                "Position 3",
                "Position 4",
                "Position 5"
        };

        boolean menu = true;

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter the index to access (0 to 4): ");
                int index = scanner.nextInt();
                System.out.println("Value: " + array[index]);
                menu = false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index — available positions are from 0 to 4.\n");
                scanner.nextLine(); // clear wrong input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input — only numbers are allowed.\n");
                scanner.nextLine(); // clear wrong input
            }
        } while (menu);

        scanner.close();
    }
}