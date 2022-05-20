package by.gsu.pms;

public class DiscountPurchase extends GeneralPurchase {
    public DiscountPurchase(String name, double price, int unitNumber) {
        super(name, price, unitNumber);
    }

    @Override
    public String toString() {
        return "DiscountPurchase" + getName()
                + getPrice() + getUnitNumber();
    }
}
