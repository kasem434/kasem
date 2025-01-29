import java.util.List;
abstract class Order {
    private int OrderId;
    private String name;
    private List<Item> items;
    private Customer customer;
    protected double totalPrice;
    private String paymentType;


    public Order(int orderId, String name, Customer customer, String deliveryAddress, List<Item> items, String paymentType) {
        this.OrderId = orderId;
        this.name = name;
        this.customer = customer;
        this.items = items;
        this.paymentType = paymentType;
        calculateTotalPrice();
        updateFavoriteItems();
    }

    private void calculateTotalPrice() {
        totalPrice = items.stream().mapToDouble(Item::getPrice).sum();
    }

    private void updateFavoriteItems() {
        for (Item item : items) {
            customer.addFavoriteItem(item);
        }
    }
    public String getName() { return name; }
    public Customer getCustomer() { return customer; }
    @Override
    public String toString() {
        return "Order ID: " + OrderId + ", Name: " + name + ", Total Price: $" + totalPrice + ", Payment: " + paymentType;
    }
}

