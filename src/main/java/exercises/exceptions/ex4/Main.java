package exercises.exceptions.ex4;

import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * Exercise – Read a non-existent file
 * ------------------------
 * Create a method that tries to open a file named "texto.txt" using FileReader.
 * You must handle FileNotFoundException.
 * ------------------------
 * Goal: checked exceptions.
 */
public class Main {

    public static void main(String[] args) {

        String fileName = "ficheiro_teste.txt";

        try {
            FileReader fr = new FileReader(fileName);
            System.out.println("File opened successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("The file '" + fileName + "' does not exist.");

        }
    }
}
