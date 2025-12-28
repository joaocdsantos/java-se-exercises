package exercises.loops.ex01;

public class EvenNumbersPrinter {

    /**
     * Exercise: Count even numbers
     * Write a program that prints all even numbers from 1 to 50.
     */
    public static void main(String[] args) {

        System.out.println("Even numbers between 1 and 50:");

        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}
