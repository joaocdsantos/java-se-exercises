package exercises.vectors.ex09;

import java.util.Scanner;

public class VectorInversion {

    /**
     * Exercício: Inverter vetor
     * Lê 7 números para um vetor e depois imprime-os na ordem inversa.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[7];

        System.out.println("Enter 7 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Reversed order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" | " + numbers[i]);
        }
        System.out.println(" |");

        scanner.close();
    }
}
