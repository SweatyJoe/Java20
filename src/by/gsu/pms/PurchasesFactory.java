package by.gsu.pms;

public class PurchasesFactory {
    private enum PurchaseFactory {
        GeneralPurchase, DiscountPurchase, DiscountPurchaseWithConstant
    }

    public GeneralPurchase purchasesFactory(String genPurchase) {
        String[] tmp = genPurchase.split(" ");
        switch (tmp[0]) {
            case "GeneralPurchase" : return new GeneralPurchase(tmp[1], Double.parseDouble(tmp[2]), Integer.parseInt(tmp[3]));
            case "DiscountPurchase" : return new DiscountPurchase(tmp[1], Double.parseDouble(tmp[2]), Integer.parseInt(tmp[3]));
            case "DiscountPurchaseWithConstant" : return new DiscountPurchaseWithConstant(tmp[1], Double.parseDouble(tmp[2]), Integer.parseInt(tmp[3]));
            default : new GeneralPurchase();
        }
        return new GeneralPurchase();
    }
}
