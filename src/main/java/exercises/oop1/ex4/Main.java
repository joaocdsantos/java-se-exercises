package exercises.oop1.ex4;

/**
 * Create class Animal (superclass)
 * name, age (private)
 * makeSound() → generic method
 * Then create 2 subclasses:
 * Dog → overrides makeSound() → "Au au!"
 * Cat → overrides makeSound() → "Miau!"
 * Tasks:
 * - Create an array of Animal with dogs and cats.
 * - Loop through the array and call makeSound().
 */
public class Main {

    public static void main(String[] args) {

        Animal[] animalList = new Animal[] {
                new Dog("Violeta", 3),
                new Cat("Tareco", 4),
                new Dog("Bolinhas", 5),
                new Dog("Rex", 6),
                new Cat("Lince", 7),
                new Cat("Garfield", 8),
        };

        System.out.println("=== makeSound() ===");
        for (Animal animal : animalList) {
            animal.makeSound();
        }

    }
}
