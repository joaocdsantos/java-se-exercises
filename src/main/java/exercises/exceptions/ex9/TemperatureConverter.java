package exercises.exceptions.ex9;

public class TemperatureConverter {

    public double converte(double temperature, String unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null.");
        }

        if (!unit.equalsIgnoreCase("C") && !unit.equalsIgnoreCase("F")) {
            throw new IllegalArgumentException("Invalid unit! Use 'C' or 'F'.");
        }

        if (unit.equalsIgnoreCase("C")) {
            return temperature * 9 / 5 + 32; // °C -> °F
        } else {
            return (temperature - 32) * 5 / 9; // °F -> °C
        }
    }

}
