package exercises.extra_exercises.practical_ex05;

import java.util.Scanner;

public class readArrayFromUser {

    /**
     * Working with Collections (arrays, lists, etc.)
     * The goal is to read a number from the console that will define
     * the size of an array, which must then be filled with values
     * read from the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("\nEnter " + size + " values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nArray Values:");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(" %d ", numbers[i]);
        }
        System.out.println("]");
        scanner.close();
    }
}
