package exercises.exceptions.ex5;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exercise – Create a custom exception
 * ------------------------
 * Create a custom exception class called InvalidAgeException.
 * public class InvalidAgeException extends Exception {
 *     public InvalidAgeException(String message) {
 *         super(message);
 *     }
 * }
 * Create a method that receives an age and throws the exception if age is negative
 * or greater than 120.
 * Then, in main, ask for an age and test the method inside a try/catch.
 * ------------------------
 * Goal: Throw custom exceptions.
 */
public class Main {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        } else if (age > 120) {
            throw new InvalidAgeException("Age cannot be greater than 120 years.");
        } else {
            System.out.println("Valid age: " + age + " years");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an age: ");
            int age = scanner.nextInt();
            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Only numeric values are allowed.");

        } finally {
            scanner.close();
        }

    }
}
