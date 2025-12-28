package exercises.oop3.miniproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Final mini-project (short and simple)
 * Zoo Animal Management System
 * ------------------------
 * 1. Abstract class: Animal
 * Properties: name, age
 * Abstract methods:
 * - makeSound()
 * - feed()
 * ------------------------
 * 2. Subclasses:
 * Lion
 * Elephant
 * Monkey
 * Each one implements makeSound() and feed() differently.
 * ------------------------
 * 3. Interface: Trainable
 * Method:
 * - void train();
 * ------------------------
 * 4. Some animals implement this interface
 * Example: Monkey implements Trainable
 * ------------------------
 * 5. Main program
 * Create a list of Animal
 * Use polymorphism to call makeSound()
 * Create a list of Trainable objects and call train()
 * Demonstrates the use of:
 * ✔ inheritance
 * ✔ polymorphism
 * ✔ abstract class
 * ✔ interface
 * ✔ method overriding
 */
public class Main {

    public static void main(String[] args) {

        List<Animal> animalsList = new ArrayList<>();
        List<Trainable> trainableAnimals = new ArrayList<>();

        Animal monkey = new Monkey("King Kong", 50);
        Animal elephant = new Elephant("Dumbo", 24);
        Animal lion = new Lion("Simba", 16);

        animalsList.add(monkey);
        animalsList.add(elephant);
        animalsList.add(lion);

        trainableAnimals.add((Trainable) monkey);
        trainableAnimals.add((Trainable) elephant);

        System.out.println("=== Animal List ===");
        for (Animal animal : animalsList) {
            System.out.println("Name: " + animal.getName() + " | Age: " + animal.getAge());
            animal.makeSound();
            animal.feed();
            System.out.println();
        }
        System.out.println("\n=== Trainable Animals ===");
        for (Trainable trainable : trainableAnimals) {
            trainable.train();
            System.out.println();
        }
    }
}