package exercises.extra_exercises.ex03;

import java.util.Random;
import java.util.Scanner;

public class MaxValueFinder {

    /**
     * Exercise 3 — Find the largest number in an array
     * Given an array of integers, find the largest value.
     * Goal: iterate through arrays and build a simple method.
     */
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = generateRandomNumbers(rand);
        int max = finfMax(numbers);

        printArray(numbers);
        printResult(max);

        scanner.close();
    }

    public static int[] generateRandomNumbers(Random rand) {
        int[] array= new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000); // 0 - 999
        }
        return array;
    }

    public static int finfMax(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void printResult(int max) {
        System.out.println("\nMax value found: " + max);
    }

    public static void printArray(int[] array) {
        System.out.println("\nGenerated values:");
        for (int item : array) {
            System.out.printf("%d | ", item);
        }
    }
}
