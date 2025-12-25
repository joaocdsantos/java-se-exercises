package exercises.extra_exercises.ex07;

import java.util.Scanner;

public class PasswordValidator {

    /**
     * Exercício 7 — Validar passwords (métodos + vetor de chars)
     * Pede ao utilizador uma password e cria um método que retorna true se:
     * tiver pelo menos 8 caracteres
     * tiver pelo menos 1 número
     * tiver pelo menos 1 letra maiúscula
     * Objetivo: exercícios de lógica + vetores de caracteresx
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
