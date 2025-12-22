package exercises.vectors.ex06;


import java.util.Scanner;

public class StoreNames {
    /**
     * Exercício: Guardar nomes
     * Cria um vetor de 5 posições para guardar nomes introduzidos pelo utilizador e imprime-os todos.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("=== MENU ===");
        System.out.println("Introduza 5 nomes:");

        // get inputs
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        // print inputs
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "ºNome: => " + names[i]);
        }
        sc.close();
    }
}
