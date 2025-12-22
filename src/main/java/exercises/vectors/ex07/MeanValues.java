package exercises.vectors.ex07;

import java.util.Scanner;

public class MeanValues {
    /**
     * Exercício: Média de valores
     * Cria um vetor com 6 notes (valores double) e imprime a média.
     *
     * @param args not used
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double[] notes = new double[6];

        System.out.println("=== MENU ===");
        System.out.println("Introduza 6 notas:");

        for (int i = 0; i < notes.length; i++) {
                notes[i] = sc.nextDouble();
        }

        // sum all values
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        //calc average
        double average = sum / notes.length;

        System.out.println("\nA média das notas é: " + average);

        sc.close();
    }
}

