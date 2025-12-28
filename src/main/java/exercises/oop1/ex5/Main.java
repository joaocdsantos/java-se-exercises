package exercises.oop1.ex5;

/**
 * Create the base class Vehicle:
 * brand, model, year (private)
 * Subclasses:
 * - Car → additional attribute: numberOfDoors
 * - Motorcycle → additional attribute: engineDisplacement (cc)
 * Tasks:
 * 1. Create instances and print their data.
 * 2. Demonstrate polymorphism using the describe() method.
 */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("Toyota", "Corolla", 2020, 4);
        Vehicle vehicle2 = new Motorcycle("Honda", "CB500", 2022, 500);

        System.out.println("=== Vehicle 1 ===");
        vehicle1.describe();
        System.out.println("\n=== Vehicle 2 ===");
        vehicle2.describe();

        // Também podes criar diretamente:
        Car car = new Car("BMW", "M3", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2023, 689);

        System.out.println("\n=== Car ===");
        car.describe();
        System.out.println("\n=== Motorcycle ===");
        motorcycle.describe();
    }
}
