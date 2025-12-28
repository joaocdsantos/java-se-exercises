package exercises.generics.ex8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 8. File-based division with exception handling
 * ----------------------------------------------
 * Create a program that:
 * - Reads two numbers from a CSV file (comma-separated)
 * - Divides the first number by the second
 * ----------------------------------------------
 * Handle the following exceptions:
 * ✔ IOException → issues reading the file
 * ✔ ArithmeticException → division by zero
 * ----------------------------------------------
 * Goal:
 * Practice file input, parsing, and multiple exception types.
 */
public class Main {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("./src/main/java/exercises/generics/ex8/dados.csv"));

            String line = br.readLine();
            String[] values = line.split(",");

            int a = Integer.parseInt(values[0].trim());
            int b = Integer.parseInt(values[1].trim());

            int result = a / b;

            System.out.println("Result: " + a + " / " + b + " = " + result);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: division by zero is not allowed.");

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("⚠Error closing the file.");
            }
        }
    }
}