package exercises.oop2.ex4;

/**
 * 4. Exercise – Inheritance with Extra Methods
 * ------------------------------------------------
 * Base class:
 * Employee
 * - name
 * - baseSalary
 * - method: calculateSalary()
 * ------------------------------------------------
 * Subclass:
 * Manager
 * - bonus
 * - total salary = baseSalary + bonus
 * ------------------------------------------------
 * In main, create a Manager and print their salary.
 * ------------------------------------------------
 * Goal: understand that subclasses can extend behavior
 * by adding new attributes and overriding methods.
 */
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Mike", 1000, 500);

        System.out.println("=== Employee - Manager ===");
        System.out.printf("Salary of %s: %.2f€%n", manager.getName(), manager.calculateSalary());
    }
}
