package exercises.matrix.ex15;

import java.util.Scanner;

public class MatrixRowMaximums {
    /**
     * Exercício: Maior de cada linha
     * Cria uma matriz 3×4 com números introduzidos pelo utilizador.
     * Imprime o maior número de cada linha.
     */
    public static void main(String[] args) {


        int rows = 3;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        int[] maxPerRow = new int[rows];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 12 integers for a 3x4 matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // GET FIRST ELEMENT OF EACH LINE
        for (int i = 0; i < rows; i++) {
            maxPerRow[i] = matrix[i][0];
        }

        //CHECK BIGGEST LINE VALUES
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxPerRow[i]) {
                    maxPerRow[i] = matrix[i][j];
                }
            }
        }

        System.out.println("\nMaximum value of each row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + maxPerRow[i]);
        }

        System.out.println("\nMatrix:");
        for (int[] number : matrix) {
            System.out.print("[ ");
            for (int j = 0; j < columns; j++) {
                System.out.print(number[j] + " ");
            }
            System.out.println("]");
        }
    }
}