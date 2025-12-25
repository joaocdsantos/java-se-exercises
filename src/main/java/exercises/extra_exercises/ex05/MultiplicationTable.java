package exercises.extra_exercises.ex05;

public class MultiplicationTable {

    /**
     * Exercício 5 — Tabela de multiplicação (matriz)
     * Cria uma matriz 10×10 que representa a tabuada de multiplicar e imprime-a no ecrã.
     * Objetivo: loops aninhados + matrizes.
     */
    public static void main(String[] args) {

        int size = 10;
        int[][] table = generateMultiplicationTable(size);
        printTable(table);
    }

    public static int[][] generateMultiplicationTable(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return matrix;
    }

    public static void printTable(int[][] table) {
        System.out.printf("Multiplication Table %dx%d:", table.length, table[0].length);

        for (int i = 0; i < table.length; i++) {
            System.out.print(" [ ");
            for (int j = 0; j < table[0].length; j++) {
                System.out.printf("%3d ", table[i][j]); // %4d dá espaçamento alinhado
            }
            System.out.println("]");
        }
    }
}
