package exercises.oop3.ex5;

/**
 * 5. Exercise — Polymorphism + Interface + Inheritance
 * -----------------------------------------------------
 * Abstract class:
 * Vehicle
 * - attribute: brand
 * - abstract method: move()
 * <p>
 * Interface:
 * Electric
 * - method: chargeBattery()
 * <p>
 * Subclasses:
 * Car → not electric
 * ElectricCar → inherits Vehicle + implements Electric
 * Bicycle → simple vehicle
 * <p>
 * Goal:
 * - Create different vehicles
 * - Call move() polymorphically
 * - If implementing Electric, also chargeBattery()
 */
public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Ford"),
                new ElectricCar("Tesla"),
                new Bicycle("Orbea")
        };

        System.out.println("=== Vehicle list ===");
        for (Vehicle v : vehicles) {
            v.move();
            if (v instanceof Electric e) {
                e.chargeBattery();
            }
        }
    }
}
