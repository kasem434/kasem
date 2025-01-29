import java.util.List;
class RegularOrder extends Order {
    public RegularOrder(int orderId, String name, Customer customer, String deliveryAddress, List <Item> items, String paymentType) {
        super(orderId, name, customer, deliveryAddress, items , paymentType);
    }
}

class VIPOrder extends Order {
    public VIPOrder(int orderId, String name, Customer customer, String deliveryAddress, List<Item> items, String paymentType) {
        super(orderId, name, customer, deliveryAddress, items, paymentType);
        applyVIPDiscount();
    }

    private void applyVIPDiscount() {
        if (!"VIP".equals(getCustomer().getCustomerType())) {
            throw new IllegalArgumentException("Only VIP customers can place VIP orders.");
        }
        double discount = getCustomer().getDiscount() != null ? getCustomer().getDiscount() : 0.0;
        totalPrice *= (1 - discount);
    }
}
