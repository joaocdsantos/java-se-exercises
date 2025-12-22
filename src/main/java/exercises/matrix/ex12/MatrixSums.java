package exercises.matrix.ex12;

import java.util.Scanner;

public class MatrixSums {
    /**
     * Exercício: Soma da matriz
     * Lê uma matriz 3×3 de inteiros e calcula:
     * a soma total dos elementos
     * a soma da primeira linha
     * a soma da diagonal principal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        int totalSum = 0;
        int firstRowSum = 0;
        int diagonalSum = 0;

        System.out.println("Enter 9 values for a 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();

                totalSum += matrix[i][j];
            }
        }

        // FIRST LINE SUM
        for (int i = 0; i < matrix.length; i++) {
            firstRowSum += matrix[0][i];
        }

        // DIAGONAL SUM
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("\nResults:");
        System.out.println("Total sum: " + totalSum);
        System.out.println("First row sum: " + firstRowSum);
        System.out.println("Main diagonal sum: " + diagonalSum);

        // MATRIX PRINT
        System.out.println("\nMatrix:");
        for (int[] row : matrix) {
            System.out.print("[");
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println("]");
        }

        scanner.close();
    }
}
