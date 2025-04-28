package se.eric.uppgifter;

public class Discount {
    public static double discount(double amount,double discount) {
        return amount * (1 - discount / 100);
    }
}
