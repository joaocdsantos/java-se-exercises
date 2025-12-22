package exercises.vectors.ex08;

import java.util.Random;
import java.util.Scanner;

public class ArrayValueFinder {
    /**
     * Exercício: Procurar um valor
     * Cria um vetor com 10 números aleatórios.
     * Pede ao utilizador um número e diz se existe no vetor e em que posição.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(" | " + num);
        }
        System.out.println(" |");

        System.out.print("Enter a number (0-9): ");
        int input = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == input) {
                System.out.println("Value "+ input + " found at position: " + (i + 1));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }

        scanner.close();
    }
}
