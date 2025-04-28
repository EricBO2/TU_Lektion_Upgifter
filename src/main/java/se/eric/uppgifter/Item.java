package se.eric.uppgifter;

public class Item {

    private String name;
    private double price;
    private int quantity;
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public static double calculateTotalPrice(Item item[]) {
        double totalPrice = 0;
        for (int i = 0; i < item.length; i++) {
            totalPrice += item[i].getTotalPrice();
        }
        return totalPrice;
    }
}
