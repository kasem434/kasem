import java.util.HashSet;
import java.util.Set;
public class Customer {
        private int customerId;
        private String firstName;
        private String lastName;
        private String email;
        private String deliveryAddress;
        private String customerType;
        private Double discount;
        private Set <Item> favoriteItems;
        private Gift customerGift;

        public Customer(int customerId, String firstName, String lastName, String email, String deliveryAddress, String customerType, Double discount) {
            this.customerId = customerId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.deliveryAddress = deliveryAddress;
            this.customerType = customerType;
            this.discount = (customerType.equals("VIP")) ? discount : null;
            this.favoriteItems = new HashSet<>();
        }

        public int getId() { return customerId; }
        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public String getEmail() { return email; }
        public String getDeliveryAddress() { return deliveryAddress; }
        public String getCustomerType() { return customerType; }
        public Double getDiscount() { return discount; }

        public void addFavoriteItem(Item item) {
            favoriteItems.add(item);
        }

        public void removeFavoriteItem(Item item) {
            favoriteItems.remove(item);
        }

        public void takeGift(Gift gift) {
            this.customerGift = gift;
            System.out.println(firstName + " received a gift!");
        }

        public void openGift() {
            if (customerGift != null) {
                customerGift.openGift();
            } else {
                System.out.println("No gift to open.");
            }
        }

        @Override
        public String toString() {
            return "Customer ID: " + customerId + ", Name: " + firstName + " " + lastName +
                    ", Type: " + customerType + ", Email: " + email;
        }
    }


