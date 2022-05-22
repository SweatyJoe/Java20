package by.gsu.pms;

public class DiscountPurchaseWithConstant extends GeneralPurchase{
    private static final double PURCHASE = 5.825;

    public DiscountPurchaseWithConstant(String name, double price, int unitNumber) {
        super(name, price, unitNumber);
    }

    public double getCost(){
        return getPrice()*getUnitNumber()*(1-PURCHASE/100);
    }

    @Override
    public String toString() {
        return "DISCOUNT_PURCHASE_WITH_CONSTANT " +
                getName() +
                " " +getPrice() +
                " " + getUnitNumber() +
                " " + getCost();
    }
}
