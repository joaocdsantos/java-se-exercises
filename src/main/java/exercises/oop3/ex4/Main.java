package exercises.oop3.ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Exercise — Interface + Multiple Implementations
 * ---------------------------------------------------
 * Create the interface:
 * public interface Payable {
 *     double calculatePayment();
 * }
 * ---------------------------------------------------
 * Implementations:
 * Product     → fixed price
 * Subscription → monthly price × months
 * Service     → hourly rate × hours
 * ---------------------------------------------------
 * Goal:
 * - Create a List<Payable>
 * - Print the total payment of each item
 */
public class Main {
    public static void main(String[] args) {

        List<Payable> items = new ArrayList<>();

        items.add(new Product(14.99));
        items.add(new Product(49.99));
        items.add(new Subscription(5.00, 12));
        items.add(new Subscription(5.99, 6));
        items.add(new Service(10.00, 8));
        items.add(new Service(20.00, 8));

        System.out.println("=== Payable Items ===");
        for (Payable item : items) {
            System.out.printf("%-15s → %.2f€%n",
                    item.getClass().getSimpleName(),
                    item.calculatePayment()
            );
        }
    }
}
