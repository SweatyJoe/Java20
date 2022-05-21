package by.gsu.pms;

public class DiscountPurchase extends GeneralPurchase {
    private final static double DISCOUNT = 50;
    public enum DiscountProduct {Milk, Kofe}
    public DiscountPurchase(String name, double price, int unitNumber) {
        super(name, price, unitNumber);
    }

    public DiscountPurchase() {
    }

    public double getCost(){
        return (getPrice()-DISCOUNT)*getUnitNumber();
    }

    @Override
    public String toString() {
        return "DISCOUNT_PURCHASE " +
                getName() +
                " " +getPrice() +
                " " + getUnitNumber() +
                " " + getCost();
    }


}
