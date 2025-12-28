package exercises.oop3.ex3;

import java.util.ArrayList;

/**
 * 3. Exercise — Abstract Class
 * ------------------------------------------------
 * Abstract class:
 * abstract class Shape {
 *     public abstract double calculateArea();
 * }
 * ------------------------------------------------
 * Subclasses:
 * Circle    → area = π * r²
 * Rectangle → area = width * height
 * ------------------------------------------------
 * Goal:
 * - Create a list of Shape
 * - Show each calculated area
 * - Reinforce that abstract classes cannot be instantiated
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle1 = new Circle(10);
        Shape circle2 = new Circle(20);
        Shape circle3 = new Circle(30);
        Shape retangle1 = new Rectangle(10, 20);
        Shape retangle2 = new Rectangle(20, 40);
        Shape retangle3 = new Rectangle(30, 60);

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(retangle1);
        shapes.add(retangle2);
        shapes.add(retangle3);

        System.out.println("=== Shape Areas ===");
        for (Shape shape : shapes) {
            System.out.printf("%s with area: %.2f%n",
                    shape.getClass().getSimpleName(),
                    shape.calculateArea()
            );
        }
    }
}
