package exercises.foundations.ex01;

import java.util.Scanner;


public class CelsiusToFahrenheit {

    /**
     * Exercício 1
     * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
     * A formula de conversão é: F = Cx(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
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
