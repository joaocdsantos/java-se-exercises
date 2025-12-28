package exercises.extra_exercises.ex02;

import java.util.Scanner;

public class AgeAverageCalculator {

    /**
     * Exercise 2 — Read values into an array
     * Ask the user for 5 ages, store them in an array, and then print the average.
     */
    public static void main(String[] args) {

        int[] ages = new int[5];
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 ages:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int age : ages) {
            sum += age;
        }

        double average = sum / ages.length;
        System.out.printf("%nAverage age: %.2f%n", average);

        scanner.close();
    }
}
