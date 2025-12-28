package exercises.exceptions.ex7;

import java.util.Scanner;

/**
 * Exercise – Simple Login System
 * ------------------------
 * Ask the user for a username and password.
 * If they are wrong, throw a custom exception LoginException.
 * In main, handle the error and show a friendly message.
 * ------------------------
 * Goal: custom exceptions + validation.
 */
public class Main {

    public static void validateLogin(String username, String password) throws LoginException {

        String USERNAME = "admin";
        String PASSWORD = "1234";

        if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
            throw new LoginException("Invalid credentials.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Username: ");
            String user = scanner.nextLine();

            System.out.print("Password: ");
            String pass = scanner.nextLine();

            validateLogin(user, pass);

            System.out.println("Login successful!");

        } catch (LoginException e) {
            System.out.println("Login error: " + e.getMessage());
        }

        scanner.close();
    }
}