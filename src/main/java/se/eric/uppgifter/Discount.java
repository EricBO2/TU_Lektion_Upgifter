package se.eric.uppgifter;

public class Discount {
    public static double discount(double price,double discount) {
        return price * (1 - discount / 100);
    }
}
