package exercises.matrix.ex13;

import java.util.Random;
import java.util.Scanner;

public class MatrixValueSearch {
    /**
     * Exercício: Procurar na matriz
     * Cria uma matriz 4×4 com números aleatórios entre 1 e 20.
     * Pede ao utilizador um valor e diz se existe na matriz e em que posição.
     */
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = 4;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(20) + 1; // 1 to 20
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println("]");
        }

        System.out.println("Enter a value between 1 and 20");
        int input = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == input) {
                    System.out.println(
                            "Value " + input + " found at row " + (i + 1) + ", column " + (j + 1));
                found = true;}
            }
        }

        if (!found) {
            System.out.println("Value not found in the matrix.");
        }

        scanner.close();
    }
}
