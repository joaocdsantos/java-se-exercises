package exercises.foundations.ex02;

import java.util.Scanner;

public class MultiplicationTable {

    /**
     * Exercise 2
     * Read a value from the console (up to 10) and display its multiplication table.
     * Example:
     * 1 x 4 = 4
     * 2 x 4 = 8
     * ...
     * 10 x 4 = 40
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 10: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.printf("Multiplication table of %d:%n",number);

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", number, i, number * i);
            }
        } else {
            System.out.println("Invalid number. Please enter a value between 1 and 10.");
        }
        scanner.close();
    }
}
