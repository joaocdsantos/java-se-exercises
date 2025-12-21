package exercises.loops.ex03;

import java.util.Scanner;

public class MultiplicationTable {

    /**
     * Exercício: Tabuada
     * Pede ao utilizador um número e imprime a respetiva tabuada de 1 a 10 usando um ciclo for.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        scanner.close();
    }
}
