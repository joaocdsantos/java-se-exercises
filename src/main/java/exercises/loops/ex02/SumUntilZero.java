package exercises.loops.ex02;

import java.util.Scanner;

public class SumUntilZero {
    /**
     * Exercício: Soma de números
     * Pede ao utilizador vários números até que este digite 0.
     * No final, mostra a soma total.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Enter numbers to sum (enter 0 to finish):");

        do {
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Total sum: " + sum);

        scanner.close();
    }
}
