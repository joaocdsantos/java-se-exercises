package exercises.extra_exercises.ex07;

import java.util.Scanner;

public class PasswordValidator {

    /**
     * Exercise 7 — Password validation (methods + char array)
     * Ask the user for a password and create a method that returns true if:
     * - it has at least 8 characters
     * - it has at least 1 number
     * - it has at least 1 uppercase letter
     * Goal: logic exercises + character arrays.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password to validate: ");
        String password = scanner.nextLine();

        boolean minLength = hasMinLength(password);
        boolean minOneNumber = hasNumber(password);
        boolean minUppercase = hasUppercase(password);

        if (minLength && minOneNumber && minUppercase) {
            System.out.println("Password is VALID.");
        } else {
            System.out.println("Password is INVALID. Must contain at least:");
            System.out.println("- 8 characters");
            System.out.println("- 1 digit");
            System.out.println("- 1 uppercase letter");
        }
        scanner.close();
    }

    public static boolean hasMinLength(String password) {
        return password.length() >= 8;
    }

    public static boolean hasNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    public static boolean hasUppercase(String pass) {
        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c))
                return true;
        }
        return false;
    }
}
