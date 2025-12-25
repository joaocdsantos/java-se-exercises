package exercises.extra_exercises.practical_ex01;

import java.util.Scanner;

public class MatrixMultiplier {

    /**
     * Vamos escrever um programa que peça o tamanho de uma matriz (A), e depois crie e inicialize a
     * matriz que deverá ter o tamanho AxA e com números de 1 até AxA.
     * De seguida, faça o dump (escreva todo o conteúdo) da matriz.
     * Depois vamos multiplicar a matriz por outro valor que iremos pedir ao utilizador, e voltar a
     * fazer o dump da matriz multiplicada
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