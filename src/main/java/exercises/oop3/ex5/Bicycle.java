package exercises.oop3.ex5;

public class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Bicycle - " + getBrand() + " is being pedaled.");
    }
}
