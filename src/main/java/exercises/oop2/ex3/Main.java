package exercises.oop2.ex3;

/**
 * 3. Exercise – Base Class + Multiple Subclasses
 * ------------------------------------------------
 * Create the following structure:
 * Vehicle (base class)
 * - brand
 * - model
 * - method: describe()
 * ------------------------------------------------
 * Subclasses:
 * Car
 * Motorcycle
 * Each must override describe() with specific information.
 * ------------------------------------------------
 * In main, create a Car and a Motorcycle and call describe().
 * ------------------------------------------------
 * Goal: understand hierarchy with multiple subclasses and method overriding.
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Renaul", "Clio", 3);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "DTR", 125);

        System.out.println("=== Car ===");
        car.describe();

        System.out.println("\n=== Motorcycle ===");
        motorcycle.describe();

    }
}
