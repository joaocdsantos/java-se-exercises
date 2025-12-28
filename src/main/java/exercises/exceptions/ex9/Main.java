package exercises.exceptions.ex9;


/**
 * Exercise – Temperature Converter
 * ------------------------
 * Create a method that receives a temperature and a unit ("C" or "F").
 * If the unit is invalid, throw an IllegalArgumentException.
 * ------------------------
 * Goal: validate parameters using exceptions.
 */
public class Main {

    public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();

        try {

            System.out.println(converter.converte(25, "C"));
            System.out.println(converter.converte(77, "F"));
            System.out.println(converter.converte(77, "K"));

        } catch (Exception e) {
            System.out.println("Conversion error: " + e.getMessage());
        }
    }
}