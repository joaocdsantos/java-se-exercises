package exercises.oop3.ex4;

public class Product implements Payable {

    private double fixedPrice;

    public Product(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public double getFixedPrice() {
        return fixedPrice;
    }

    @Override
    public double calculatePayment() {
        return getFixedPrice();
    }
}