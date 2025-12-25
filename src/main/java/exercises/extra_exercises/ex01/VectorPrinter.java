package exercises.extra_exercises.ex01;

import java.util.Random;

public class VectorPrinter {

    /**
     * Exercício 1 — Criar e percorrer um vetor (nível básico)
     * Criar um vetor de 5 números inteiros e imprime-os todos no ecrã.
     * Objetivo: declarar vetores e usar um ciclo for.
     */
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(200);
        }

        System.out.println("Generated values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
