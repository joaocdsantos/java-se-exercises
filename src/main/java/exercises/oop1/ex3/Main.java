package exercises.oop1.ex3;

/**
 * Create the Product class with:
 * name, price, quantity (private)
 * Rules:
 * - price cannot be < 0
 * - quantity cannot be < 0
 * - Method calculateTotal()
 * Tasks:
 * 1. Create multiple products and test validation.
 * 2. Fix invalid values using setters.
 */
public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Pencil", 1, 30);
        Product product2 = new Product("Pen", 2, 50);

        System.out.println("=== PRODUCT 1 ===");
        System.out.println(product1);
        System.out.printf("Total: %.2f€%n",product1.calculateTotal());

        System.out.println("\n=== PRODUCT 2 ===");
        System.out.println(product2);
        System.out.printf("Total: %.2f€%n",product2.calculateTotal());

        System.out.println("\n=== INVALID TESTS ===");
        Product product3 = new Product("Marker", 1, -1);
        Product product4 = new Product("Mechanical Pencil", -1, 30);

        product3.setQuantity(10);
        product4.setPrice(1.5);

        System.out.println("\n=== FIXED PRODUCTS ===");
        System.out.println(product3);
        System.out.printf("Total: %.2f€%n",product3.calculateTotal());
        System.out.println(product4);
        System.out.printf("Total: %.2f€%n",product4.calculateTotal());
    }
}
