package exercises.vectors.ex10;


import java.util.Scanner;

public class CountOccurrencesOfFive {

    /**
     * Exercise: Count occurrences
     * Read 10 numbers into an array and count how many times the number 5 appears.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] == 5) {
                count++;
            }
        }

        System.out.println("The number 5 appears " + count + " times.");

        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(" | " + num);
        }
        System.out.println("|");

        scanner.close();
    }
}
