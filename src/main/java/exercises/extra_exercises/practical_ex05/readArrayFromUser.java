package exercises.extra_exercises.practical_ex05;

import java.util.Scanner;

public class readArrayFromUser {

    /**
     * Vamos trabalhar com Collections (vetores, arrays, listas,..)
     * O objectivo é ler da consola um número que vai indicar o tamanho de um array ou vetor, que
     * depois tem de ser preenchido com valores lidos da consola.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("\nEnter " + size + " values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nArray Values:");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(" %d ", numbers[i]);
        }
        System.out.println("]");
        scanner.close();
    }
}
