import java.util.ArrayList;
import java.util.List;
public class OrderManagementSystem {
        private List<Order> orders = new ArrayList<>();

        public void placeOrder(Order order) {
            orders.add(order);
            System.out.println("Order placed: " + order);
        }

        public void listOrders() {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }


