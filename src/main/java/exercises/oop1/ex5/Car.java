package exercises.oop1.ex5;

public class Car extends Vehicle {

    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Doors: " + getDoors());
    }
}
