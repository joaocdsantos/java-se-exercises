package exercises.generics.ex3;

/**
 * 3. Generic Method - printArray
 * -------------------------------
 * Create a generic method:
 *      public static <T> void printArray(T[] array)
 * that prints each element of any array type.
 * -------------------------------
 * Test with arrays of:
 * - Integer
 * - String
 * - Double
 */
public class Main {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};
        String[] words = {"Training", "Java", "João"};
        Double[] doubles = {1.1, 2.5, 3.75};

        System.out.println("=== Integer Array ===");
        printArray(numbers);

        System.out.println("\n=== String Array ===");
        printArray(words);

        System.out.println("\n=== Double Array ===");
        printArray(doubles);
    }
}
