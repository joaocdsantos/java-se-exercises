package exercises.oop2.ex2;

/**
 * 2. Exercise – Inheritance with Super Constructor
 * ------------------------
 * Create the following classes:
 * Animal
 * - attribute: name
 * - method: makeSound()
 * ------------------------
 * Dog (extends Animal)
 * - overrides makeSound() to print "The dog barks!"
 * ------------------------
 * In main, create a Dog object and test the method.
 * ------------------------
 * Goal: use constructors with super() and basic method overriding.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Dog ===");
        Dog dog = new Dog("Bobby");
        dog.makeSound();

        System.out.println("=== Animal ===");
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();
    }
}
