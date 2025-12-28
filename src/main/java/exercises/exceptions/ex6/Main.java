package exercises.exceptions.ex6;

/**
 * Exercise – divide method with throws
 * ------------------------
 * Create a method:
 * public static int divide(int a, int b) throws ArithmeticException
 * And call it inside main, using try/catch to handle the exception.
 * ------------------------
 * Goal: understand how to use throws.
 */
public class Main {

    public static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error while dividing: " + e.getMessage());
        }
    }
}
