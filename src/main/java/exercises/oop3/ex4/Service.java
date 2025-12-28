package exercises.oop3.ex4;

public class Service implements Payable {

    private double hourlyRate;
    private int hours;

    public Service(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public double calculatePayment() {
        return getHourlyRate() * getHours();
    }
}
