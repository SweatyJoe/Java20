package by.gsu.pms;

public class GeneralPurchase {
    private String name;
    private double price;
    private int unitNumber;

    public GeneralPurchase(String name, double price, int unitNumber) {
        this.name = name;
        this.price = price;
        this.unitNumber = unitNumber;
    }

    public GeneralPurchase() {
    }

    public double getCost(){
        return price * unitNumber;
    }

    @Override
    public String toString() {
        return "GENERAL_PURCHASE " + name +
                " " + price +
                " " + unitNumber +
                " " + getCost();
    }

    //generated*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneralPurchase that = (GeneralPurchase) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (unitNumber != that.unitNumber) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    //generated*
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + unitNumber;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

}
