package exercises.oop2.ex3;

public class Vehicle {

    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void describe() {
        System.out.print("Brand: " + getBrand() + "| Model: " + getModel());
    }
}
