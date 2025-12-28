package exercises.oop1.ex3;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be less than 0.00€");
            return;
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be less than 0.");
            return;
        }
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " | Quantity: " + quantity +
                " | Price: " + String.format("%.2f€", price);
    }
}
