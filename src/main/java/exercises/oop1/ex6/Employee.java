package exercises.oop1.ex6;

public class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void describe() {
        System.out.println("Employee: " + getName() + " | Final Salary: " + calculateSalary());
    }
}
