package exercises.extra_exercises.ex01;

import java.util.Random;

public class VectorPrinter {

    /**
     * Exercise 1 — Create and iterate an array (basic level)
     * Create an array with 5 integers and print all values to the screen.
     * Goal: declare arrays and use a for loop.
     */
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(200);
        }

        System.out.println("Generated values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
