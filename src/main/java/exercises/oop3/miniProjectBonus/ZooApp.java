package exercises.oop3.miniProjectBonus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * Bonus Exercise — Reading Objects from a CSV File
 * ------------------------------------------------
 * In this exercise, you will load animal objects from a CSV file
 * instead of creating them manually in the code.
 *
 * Concepts demonstrated:
 * ✔ Inheritance
 * ✔ Polymorphism
 * ✔ Abstract classes
 * ✔ Interfaces
 * ✔ File reading with Scanner (CSV)
 *
 * ------------------------------------------------
 * Instructions:
 * 1. Complete the previous Zoo project (Animal, subclasses, Trainable interface).
 * 2. Place the file "animals.csv" in the project root folder
 *    (same level as /src, NOT inside /src).
 * 3. Replace your main class with the provided ZooApp code.
 * 4. Run the program and observe:
 *    - Animals being created dynamically from the CSV file
 *    - makeSound() and feed() being called using polymorphism
 *    - Trainable animals being added to a separate list and trained
 *
 * ------------------------------------------------
 * CSV structure (example):
 * type,name,age
 * Lion,Simba,5
 * Elephant,Dumbo,10
 * Monkey,George,3
 *
 * ------------------------------------------------
 * Expected Behaviour:
 * 📌 Read each line of the CSV, create the correct animal type
 * 📌 Print information using overridden methods
 * 📌 If the animal implements Trainable, call train()
 *
 * ------------------------------------------------
 * Expected Output Example:
 * Loaded Animals:
 * Lion: Simba (5 years)
 * Elephant: Dumbo (10 years)
 * Monkey: George (3 years)
 *
 * Animal Sounds:
 * Simba makes Rooooar!
 * Dumbo makes Fuuuuuh!
 * George makes Uh uh ah ah!
 *
 * Feeding:
 * Simba eats meat.
 * Dumbo eats plants.
 * George eats fruit.
 *
 * Trainable Animals:
 * George is being trained for shows!
 *
 * Program finished successfully!
 * ------------------------------------------------
 * Goal:
 * Show how OOP can integrate with external data sources
 * and simulate real-world applications.
 */
public class ZooApp {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Trainable> trainables = new ArrayList<>();

        File csvFile = new File("./src/main/java/exercises/oop3/miniProjectBonus/animais.csv");

        try (Scanner scanner = new Scanner(csvFile)) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip header
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String type = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);

                Animal animal = null;

                switch (type) {
                    case "Lion":
                        animal = new Lion(name, age);
                        break;
                    case "Elephant":
                        animal = new Elephant(name, age);
                        break;
                    case "Monkey":
                        animal = new Monkey(name, age);
                        break;
                    default:
                        System.out.println("Unknown type: " + type);
                }

                if (animal != null) {
                    animals.add(animal);
                    // only add if the animal actually implements Trainable
                    if (animal instanceof Trainable t) {
                        trainables.add(t);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: CSV file not found: " + csvFile.getPath());
            return;
        }

        // Show all animals
        System.out.println("\n📘 Loaded Animals:");
        animals.forEach(System.out::println);

        // Polymorphism: makeSound and feed
        System.out.println("\n🔊 Animal Sounds:");
        animals.forEach(Animal::makeSound);

        System.out.println("\n🍽️ Feeding:");
        animals.forEach(Animal::feed);

        // Train trainable animals
        System.out.println("\n🏋️ Trainable Animals:");
        trainables.forEach(Trainable::train);

        System.out.println("\n✔ Program finished successfully!");
    }
}
