package exercises.vectors.ex06;


import java.util.Scanner;

public class StoreNames {
    /**
     * Exercise: Store names
     * Create an array with 5 positions to store names entered by the user and print all of them.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] namesList = new String[5];


        System.out.println("Enter 5 names:");

        for (int i = 0; i < namesList.length; i++) {
            namesList[i] = scanner.nextLine();
        }

        for (int i = 0; i < namesList.length; i++) {
            System.out.println("Name "+ (i + 1) +": " + namesList[i]);
        }
        scanner.close();
    }
}
