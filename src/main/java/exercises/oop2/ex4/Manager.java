package exercises.oop2.ex4;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBonus();
    }
}
