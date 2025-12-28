package exercises.loops.ex04;


import java.util.Scanner;

public class MaxNumberFinder {
    /**
     * Exercise: Find the largest number
     * Ask the user for 5 numbers and display which one is the largest.
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
