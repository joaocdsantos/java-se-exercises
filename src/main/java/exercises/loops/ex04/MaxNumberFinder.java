package exercises.loops.ex04;


import java.util.Scanner;

public class MaxNumberFinder {
    /**
     * Exercício: Encontrar o maior número
     * Pede 5 números ao utilizador e indica qual é o maior.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbersList = new int[5];

        System.out.println("Enter 5 integer numbers:");

        for (int i = 0; i < numbersList.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbersList[i] = scanner.nextInt();
        }

        int max = numbersList[0];

        // find max
        for (int num : numbersList) {
            if (num >= max)
                max = num;
        }

        System.out.println("The largest number entered was: " + max);

        scanner.close();
    }
}
