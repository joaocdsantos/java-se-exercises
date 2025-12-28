package exercises.oop1.ex5;

public class Motorcycle extends Vehicle {

    private double engineDisplacement;

    public Motorcycle(String brand, String model, int year, double engineDisplacement) {
        super(brand, model, year);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Cilindrada: " + getEngineDisplacement() + "cc");
    }
}
