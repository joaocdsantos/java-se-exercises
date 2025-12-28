package exercises.oop3.ex5;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Car - " + getBrand() + " is moving using fuel.");
    }
}
