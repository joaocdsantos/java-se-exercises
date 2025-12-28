package exercises.oop3.ex4;

public class Subscription implements Payable {

    private double monthlyPrice;
    private int months;

    public Subscription(double monthlyPrice, int months) {
        this.monthlyPrice = monthlyPrice;
        this.months = months;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }
    public int getMonths() {
        return months;
    }

    @Override
    public double calculatePayment() {
        return getMonthlyPrice() * getMonths();
    }
}
