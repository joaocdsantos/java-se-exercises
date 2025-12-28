package exercises.exceptions.ex1;

import java.util.Scanner;

/**
 * Exercise – Safe Division
 * ------------------------
 * Create a program that asks the user for two numbers (using Scanner) and performs the division.
 * You must handle the ArithmeticException to avoid division by zero.
 * ------------------------
 * Goal: basic try/catch.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int firstNum = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int secondNum = scanner.nextInt();

            int result = firstNum / secondNum;

            System.out.println("Result: " + firstNum + " / " + secondNum + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
