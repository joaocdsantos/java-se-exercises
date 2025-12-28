package exercises.generics.ex6;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 6. Reading a non-existing file (Exception Handling)
 * ----------------------------------
 * Attempt to open a file with:
 * FileReader fr = new FileReader("data.txt");
 * ----------------------------------
 * Expected result:
 * - If the file does not exist, catch the FileNotFoundException.
 * - Print a friendly message and the error detail.
 * ----------------------------------
 * Goal:
 * Practice basic exception handling with checked exceptions.
 */
public class Main {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("dados.txt");
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found:  " + e.getMessage());
        }
    }
}