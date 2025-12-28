package exercises.oop3.ex1;

/**
 * 1. Exercise — Simple Polymorphism (method overriding)
 * -----------------------------------------------------
 * Base class:
 * class Animal {
 *     public void makeSound() {
 *         System.out.println("The animal makes a sound.");
 *     }
 * }
 * -----------------------------------------------------
 * Subclasses:
 * Dog  → prints "The dog barks."
 * Cat  → prints "The cat meows."
 * Cow  → prints "The cow moos."
 * -----------------------------------------------------
 * Goal:
 * Create an Animal[] array with different animals.
 * Loop through the array and call makeSound()
 * → demonstrate polymorphism in action.
 */
public class Main {
    public static void main(String[] args) {

        Animal[] animalList = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        for (Animal animal : animalList) {
            animal.makeSound();
        }
    }
}