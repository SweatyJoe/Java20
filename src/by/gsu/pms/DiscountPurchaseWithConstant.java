package by.gsu.pms;

public class DiscountPurchaseWithConstant extends GeneralPurchase{
    public static final int SUB_CONSTANT = 3;

    public DiscountPurchaseWithConstant(String name, double price, int unitNumber) {
        super(name, price, unitNumber);
    }

    public void PriceFixer(){
        setPrice(getPrice()*getUnitNumber()*(-5.825/100));
    }

    @Override
    public String toString() {
        return "DiscountPurchaseWithConstant " +
                getName() +
                " " +getPrice() +
                " " + getUnitNumber();
    }
}
