package exercises.generics.ex9;

import java.util.Scanner;

/**
 * 9. Convert String to Integer
 * ----------------------------------
 * Ask the user for a String input.
 * Use Integer.parseInt()
 * → May throw NumberFormatException.
 * ----------------------------------
 * Create try/catch and print “Invalid value”.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Valid number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value.");
        } finally {
            scanner.close();
        }
    }
}
