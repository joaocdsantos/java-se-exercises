package exercises.vectors.ex09;

import java.util.Scanner;

public class VectorInversion {

    /**
     * Exercício: Inverter vetor
     * Lê 7 números para um vetor e depois imprime-os na ordem inversa.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[7];

        System.out.println("====== MENU ======");
        System.out.println("Introduza 7 números:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("==================");
        System.out.print("Invertidos:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" | " + numbers[i]);
        }
        System.out.println(" |");
        System.out.println("====== FIM ======");

        sc.close();
    }
}
