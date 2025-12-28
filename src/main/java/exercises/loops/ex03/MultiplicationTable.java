package exercises.loops.ex03;

import java.util.Scanner;

public class MultiplicationTable {

    /**
     * Exercise: Multiplication Table
     * Ask the user for a number and print its multiplication table from 1 to 10 using a for loop.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        scanner.close();
    }
}
