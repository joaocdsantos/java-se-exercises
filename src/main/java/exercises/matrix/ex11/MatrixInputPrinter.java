package exercises.matrix.ex11;

import java.util.Scanner;

public class MatrixInputPrinter {

    /**
     * Exercise: Create a 3x3 matrix
     * Create a 3×3 matrix with numbers provided by the user and print it in a table format.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] numbers = new int[3][3];

        System.out.println("Enter 9 values for a 3x3 matrix:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int[] number : numbers) {
            System.out.print("[");
            for (int j = 0; j < numbers.length; j++) {
                System.out.printf("%3d ", number[j]);
            }
            System.out.println("]");
        }

        scanner.close();
    }
}