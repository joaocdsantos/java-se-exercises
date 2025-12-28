package exercises.oop1.ex6;

/**
 * Create the superclass Employee:
 * name, baseSalary (private)
 * method calculateSalary()
 * Subclasses:
 * - FullTimeEmployee → salary = baseSalary + 200
 * - PartTimeEmployee → salary = baseSalary * 0.5
 * Tasks:
 * 1. Create multiple employees.
 * 2. Display real salaries using polymorphism.
 */
public class Main {
    public static void main(String[] args) {

        Employee[] employeeList = {
                new FullTimeEmployee("Ana", 1000),
                new PartTimeEmployee("Bruno", 1000),
                new FullTimeEmployee("Carlos", 2000),
                new PartTimeEmployee("Diana", 2000)
        };

        System.out.println("=== Employee List ===");
        for (Employee f : employeeList) {
            f.describe();
            System.out.println();
        }
    }
}
