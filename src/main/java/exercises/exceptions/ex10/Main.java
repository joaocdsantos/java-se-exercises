package exercises.exceptions.ex10;

import java.util.Scanner;

/**
 * Exercise – Registration with Multiple Exceptions
 * ------------------------
 * Create a method that receives:
 * - name  (cannot be empty → IllegalArgumentException)
 * - age   (cannot be negative → InvalidAgeException)
 * - email (must contain “@” → InvalidEmailException)
 * ------------------------
 * Ask the user for all data and handle the 3 exceptions.
 * ------------------------
 * Goal: demonstrate multiple exception types and validation.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        try {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            System.out.print("Email: ");
            String email = scanner.nextLine();

            registration.validate(name, age, email);

        } catch (IllegalArgumentException e) {
            System.out.println("Name error: " + e.getMessage());

        } catch (InvalidAgeException e) {
            System.out.println("Age error: " + e.getMessage());

        } catch (InvalidEmailException e) {
            System.out.println("Email error: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}
