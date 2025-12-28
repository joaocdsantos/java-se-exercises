package exercises.oop3.ex5;

public class ElectricCar extends Vehicle implements Electric {

    public ElectricCar(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Electric Car - " + getBrand() + " is moving silently.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery of " + getBrand());
    }

}
