package exercises.oop1.ex6;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * 0.5;
    }

    @Override
    public void describe() {
        System.out.println("Part-Time Employee");
        super.describe();
    }
}
