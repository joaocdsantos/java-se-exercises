package exercises.oop2.ex3;

public class Motorcycle extends Vehicle {

    private double engineDisplacement;

    public Motorcycle(String marca, String modelo, double engineDisplacement) {
        super(marca, modelo);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" | Engine displacement: " + getEngineDisplacement() + "cc");
    }
}
