package exercises.foundations.ex03;

import java.util.Scanner;

public class EvenOrOddChecker {

    /**
     * Exercício 3
     * Fazer a leitura de um número inteiro e verificar se ele é par ou ímpar.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("The number " + number + " is EVEN.");
        } else {
            System.out.println("The number " + number + " is ODD.");
        }
        scanner.close();
    }
}