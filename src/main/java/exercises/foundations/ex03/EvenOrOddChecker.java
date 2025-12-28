package exercises.foundations.ex03;

import java.util.Scanner;

public class EvenOrOddChecker {

    /**
     * Exercise 3
     * Read an integer from the console and determine if it is even or odd.
     * Print the result to the user.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("The number " + number + " is EVEN.");
        } else {
            System.out.println("The number " + number + " is ODD.");
        }
        scanner.close();
    }
}