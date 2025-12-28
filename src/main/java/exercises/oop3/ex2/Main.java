package exercises.oop3.ex2;

/**
 * 2. Exercise — Polymorphism + Inheritance + Common Method
 * --------------------------------------------------------
 * Base class:
 * class Employee {
 *     public double calculateSalary() { return 0; }
 * }
 * --------------------------------------------------------
 * Subclasses:
 * FullTimeEmployee   → returns 1200
 * PartTimeEmployee   → returns 600
 * Intern             → returns 300
 * --------------------------------------------------------
 * Goal:
 * Create an Employee[] array
 * Print each salary using polymorphism
 */
public class Main {

    public static void main(String[] args) {

        Employee[] employeeList = {
                new FullTimeEmployee(),
                new PartTimeEmployee(),
                new Intern()
        };

        System.out.println("=== Salaries ===");
        for (Employee employee : employeeList) {
            System.out.printf("%s → %.2f€%n",
                    employee.getClass().getSimpleName(),
                    employee.calculateSalary()
            );        }
    }
}
