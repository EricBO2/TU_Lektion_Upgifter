package se.eric.uppgifter;

public class Main {
    public static void main(String[] args) {
        // Items
        Item item1 = new Item("Laptop", 1000.00, 1);
        Item item2 = new Item("Phone", 500.00, 2);

        // Prices before discount
        double totalBeforeDiscount = Item.calculateTotalPrice(new Item[] { item1, item2 });
        System.out.println("Total before discount: $" + totalBeforeDiscount);

        // Discount
        double discount = 10;

        // calculating total for the items
        double TotalAfterDiscount = Discount.discount(totalBeforeDiscount,discount);
        System.out.println("Another total after discount: $" + TotalAfterDiscount);
    }


}
