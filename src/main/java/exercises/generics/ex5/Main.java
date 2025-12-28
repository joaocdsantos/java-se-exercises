package exercises.generics.ex5;

/**
 * 5. Generic Interface - Identifiable<T>
 * ----------------------------------
 * Create an interface:
 *   public interface Identifiable<T> {
 *       T getId();
 *   }
 * ----------------------------------
 * Create a class Person implementing Identifiable<Integer>.
 * Create a class Product implementing Identifiable<String>.
 * ----------------------------------
 * Goal:
 * Instantiate both classes in Main and print their IDs.
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person(101);
        Product product = new Product("PRODUCT-123");

        System.out.println("Person ID: " + person.getId());
        System.out.println("Product ID: " + product.getId());
    }
}