package exercises.foundations.ex01;

import java.util.Scanner;


public class CelsiusToFahrenheit {

    /**
     * Exercise 1
     * Read a temperature value in Celsius and display the converted value in Fahrenheit.
     * Conversion formula: F = C × (9.0 / 5.0) + 32.0
     * (F = Fahrenheit, C = Celsius)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.printf("%.2f ºC = %.2f ºF%n", celsius, fahrenheit);

        scanner.close();
    }
}
