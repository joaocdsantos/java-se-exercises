package exercises.oop2.miniProject;

import java.util.ArrayList;

/**
 * Mini-Project: Zoo Animal Management System
 * --------------------------------------------
 * Goal: Apply inheritance, polymorphism, abstract classes and overridden methods
 * in a simple and practical way.
 * --------------------------------------------
 * Project Description
 * The Zoo needs a small system to register animals and execute common actions,
 * such as making sounds and showing information.
 * --------------------------------------------
 * 1. Base Class (Superclass)
 *    Animal
 *    - name
 *    - age
 *    - Methods:
 *        - makeSound() → abstract
 *        - showInfo()  → prints name and age
 * --------------------------------------------
 * 2. Subclasses (Inheritance)
 *    Create at least 3 subclasses, for example:
 *    Lion
 *    - Sound: "Roar!"
 *    Elephant
 *    - Sound: "Fuuuuh!"
 *    Monkey
 *    - Sound: "Oooh oooh aaah aaah!"
 *    Each subclass must implement makeSound().
 * --------------------------------------------
 * 3. Main Class
 *    ZooApp
 *    Minimum features:
 *    - Create a list of animals (ArrayList<Animal>)
 *    - Add different animals to the list
 *    - Loop through the list and:
 *        - Show info
 *        - Call makeSound() (polymorphism in action)
 * --------------------------------------------
 * Technical Requirements:
 * ✔ Use inheritance
 * ✔ Use polymorphism (list of Animal with multiple concrete types)
 * ✔ Create and use an abstract method
 * ✔ Instantiate subclass objects
 * ✔ Print data to the terminal
 * --------------------------------------------
 * Extra Challenge (optional):
 * - Create a Bird subclass with an extra fly() method
 * - Create a menu in the terminal to add animals dynamically
 * - Save animals to a text file
 * --------------------------------------------
 * Example of expected output:
 *  Animal: Simba (3 years old)
 *  Sound: Roar!
 */
public class ZooApp {

    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<>();

        Animal lion = new Lion("Simba", 3);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal monkey = new Monkey("Kiko", 2);

        animalList.add(lion);
        animalList.add(elephant);
        animalList.add(monkey);

        Animal duck = new Duck("Donald", 4);
        animalList.add(duck);


        System.out.println("=== Animal List ===");
        for (Animal animal : animalList) {
            animal.showInfo();
            animal.makeSound();
            if (animal instanceof Bird bird) {
                bird.fly();
            }
        }
    }
}
