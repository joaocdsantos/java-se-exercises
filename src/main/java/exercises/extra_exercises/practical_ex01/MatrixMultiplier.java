package exercises.extra_exercises.practical_ex01;

import java.util.Scanner;

public class MatrixMultiplier {

    /**
     * Write a program that asks the user for the size of a matrix (A),
     * then creates and initializes an AxA matrix with numbers from 1 to AxA.
     * Next, print (dump) the entire matrix on the screen.
     * Then, multiply the matrix by a number provided by the user
     * and print the matrix again after the multiplication.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = generateMatrix(size);

        System.out.println("\nInitial Matrix:");
        printMatrix(matrix);

        System.out.print("\nEnter a multiplier: ");
        int multiplier = scanner.nextInt();

        multiplyMatrix(matrix, multiplier);

        System.out.println("\nMatrix after multiplication:");
        printMatrix(matrix);
    }

    private static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        int value = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

    private static void multiplyMatrix(int[][] matrix, int multiplier) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= multiplier;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("> ");
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}