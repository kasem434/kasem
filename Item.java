public class Item {
    private int ItemId;
    private String name;
    private double price;
    public Item(int itemId, String name, double price) {
        this.ItemId = itemId;
        this.name = name;
        this.price = price;
    }
    public int getId() { return ItemId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
