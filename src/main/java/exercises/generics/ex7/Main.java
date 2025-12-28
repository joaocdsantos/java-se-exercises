package exercises.generics.ex7;

/**
 * 7. Create a method that throws an exception
 * ------------------------------------------
 * Create a method:
 *     public static void validateAge(int age) throws Exception
 * ------------------------------------------
 * Rule:
 * - If age < 0 → throw an Exception.
 * ------------------------------------------
 * Goal:
 * Test the method in main() using try/catch.
 * Practice custom validation and exception handling.
 */
public class Main {

    public static void validateAge (int age) throws Exception{
        if (age < 0) {
            throw new Exception("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(20);
            System.out.println("Valid age.");
            validateAge(-5);
        } catch (Exception e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}
