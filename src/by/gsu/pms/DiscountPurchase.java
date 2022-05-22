package by.gsu.pms;

public class DiscountPurchase extends GeneralPurchase {
    private final static double DISCOUNT = 20;
    public DiscountPurchase(String name, double price, int unitNumber) {
        super(name, price, unitNumber);
    }

    public DiscountPurchase() {
    }

    public double getCost(){
        if(DISCOUNT >= getUnitNumber()){
            return (getPrice()-DISCOUNT)*getUnitNumber();
        }
        return super.getCost();
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
