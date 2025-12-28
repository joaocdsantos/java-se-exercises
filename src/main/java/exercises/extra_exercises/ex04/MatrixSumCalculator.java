package exercises.extra_exercises.ex04;

import java.util.Random;
import java.util.Scanner;

public class MatrixSumCalculator {

    /**
     * Exercise 4 — Sum elements of a 2D matrix
     * Create a 3×3 matrix with integer values of your choice and calculate the total sum.
     */
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = generateRandomNumbers(random);
        int sum = calculateSum(matrix);

        printArray(matrix);
        printResult(sum);

        scanner.close();
    }

    public static int[][] generateRandomNumbers(Random random) {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100); // 0 - 99
            }
        }
        return array;
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void printArray(int[][] array) {
        System.out.println("\nMatrix 3x3:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public static void printResult(int sum) {
        System.out.println("\nTotal sum of elements: " + sum);
    }
}