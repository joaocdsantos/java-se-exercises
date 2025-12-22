package exercises.vectors.ex10;


import java.util.Scanner;

public class CountNumber {

    /**
     * Exercício: Contar ocorrências
     * Lê 10 números para um vetor e conta quantas vezes aparece o número 5.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== MENU ======");
        System.out.println("Introduza 10 números:");

        int[] numbers = new int[10];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] == 5) {
                counter++;
            }
        }

        System.out.println("O número 5 aparece " + counter + " vezes");

        System.out.println("==================");
        System.out.print("Números :");
        for (int num : numbers) {
            System.out.print(" | " + num);
        }
        System.out.println("|");

        System.out.println("====== FIM ======");

        sc.close();
    }
}
