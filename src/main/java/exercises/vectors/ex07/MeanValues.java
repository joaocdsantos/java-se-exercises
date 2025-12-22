package exercises.vectors.ex07;

import java.util.Scanner;

public class MeanValues {
    /**
     * Exercício: Média de valores
     * Cria um vetor com 6 notes (valores double) e imprime a média.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notes = new double[6];

        System.out.println("Enter 6 values:");

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            notes[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        double average = sum / notes.length;

        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}

