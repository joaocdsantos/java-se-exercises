package exercises.oop1.ex6;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String nome, double baseSalary) {
        super(nome, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 200;
    }

    @Override
    public void describe() {
        System.out.println("Full-Time Employee");
        super.describe();
    }
}
