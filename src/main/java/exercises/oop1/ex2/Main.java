package exercises.oop1.ex2;

/**
 * Create the Person class with:
 * Private attributes: name, age
 * Getters and setters with rules:
 * - age cannot be negative
 * - name cannot be empty
 * Tasks:
 * 1. Create multiple Person objects and test validations.
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Maria", 50);
        Person person2 = new Person("João", 36);

        System.out.println("=== VALID PERSONS ===");
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("\n=== INVALID PERSONS TEST ===");
        Person person3 = new Person("Maria", -1);
        Person person4 = new Person("", 36);

        person3.setAge(36);
        person4.setName("João");

        System.out.println("\n=== AFTER FIXING ===");
        System.out.println(person3);
        System.out.println(person4);
    }
}
