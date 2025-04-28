package se.eric.uppgifter;

import se.eric.uppgifter.animale.Animale;
import se.eric.uppgifter.animale.Bird;
import se.eric.uppgifter.animale.Dog;

import java.util.ArrayList;
import java.util.List;

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

        // ---------------------------------------------------------------------------
        // uppgift 4
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird());
        birds.add(new Bird());
        //birds.add(new Dog());     //docent work

        List<Animale> animales = new ArrayList<>();
        animales.add(new Dog());
        animales.add(new Bird());
        animales.add(new Dog());    //works
    }


}


/*  Uppgift #4.5
 class ShoppingCart {
    private Discount discount;
    public ShoppingCart (Discount discount) {
        this.discount = discount;
    }
    public double calculateTotal (double total) {
        return discount.applyDiscount (total);
    }
 }
*then här classen följer Dependency Inversion principen om den inte gjorde det skulle det se ut så här

 class ShoppingCart {
    private Discount discount;
    public ShoppingCart () {
        this.discount = new discount;
    }
    public double calculateTotal (double total) {
        return discount.applyDiscount (total);
    }
 }
* */