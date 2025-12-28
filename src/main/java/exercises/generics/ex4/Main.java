package exercises.generics.ex4;

/**
 * 4. Generic Class - Pair<K, V>
 * ----------------------------------
 * Create a generic class Pair<K, V> with:
 * - key   (K)
 * - value (V)
 * ----------------------------------
 * Methods:
 * - getKey()
 * - getValue()
 * - toString()
 * ----------------------------------
 * Test by creating: new Pair<>("Name", 20)
 */
public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> record = new Pair<>("Name", 20);
        System.out.println(record);
    }
}
