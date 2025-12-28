package exercises.generics.ex1;

/**
 * 1. Generic Class — Box<T>
 * ------------------------
 * Create a generic class Box<T> that stores a single object of type T.
 *
 * Requirements:
 * - Private attribute: value
 * - Methods:
 *      void store(T newValue)
 *      T retrieve()
 *
 * Test in main:
 * - Store a String, then an Integer, and print them.
 */
public class Main {

    public static void main(String[] args) {

        Box<String> textBox = new Box<>();
        textBox.store("João");
        System.out.println(textBox.retrive());

        Box<Integer> numberBox = new Box<>();
        numberBox.store(1989);
        System.out.println(numberBox.retrive());
    }
}