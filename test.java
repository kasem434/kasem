import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer(1, "ness", "levi", "ness@gmail.com", "haifa", "REGULAR", null);
        Customer vipCustomer = new Customer(2, "kasem", "mokatren", "kasem.oulook.com", "shibli", "VIP", 0.1);


        Item item1 = new Item(101, "Laptop", 1200.0);
        Item item2 = new Item(102, "Mouse", 25.0);

        RegularOrder regOrder = new RegularOrder(1, "ness's Order", regularCustomer, "haifa", Arrays.asList(item1, item2), "CREDIT CARD");
        VIPOrder vipOrder = new VIPOrder(2, "kasem's Order", vipCustomer, "shibli", Arrays.asList(item1, item2), "CASH");

        OrderManagementSystem system = new OrderManagementSystem();
        system.placeOrder(regOrder);
        system.placeOrder(vipOrder);

        system.listOrders();


    }
}
