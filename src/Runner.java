import by.gsu.pms.DiscountPurchaseWithConstant;
import by.gsu.pms.GeneralPurchase;
import by.gsu.pms.WriterInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static by.gsu.pms.DiscountPurchaseWithConstant.SUB_CONSTANT;
import static by.gsu.pms.WriterInfo.Writer;

public class Runner {
    public static void main(String[] args) {
        GeneralPurchase[] purchases = {
                new GeneralPurchase(),
                new GeneralPurchase(),
                new GeneralPurchase(),
                new GeneralPurchase(),
                new GeneralPurchase(),
                new GeneralPurchase(),
        };
        Worker(purchases);
        Writer(purchases);
    }

    private static void Worker(GeneralPurchase[] purchases){
        final String FILE = "src/files/file.txt";
        List<String> listLines  = new ArrayList<>();
        try(Scanner sc = new Scanner(new FileReader(FILE))){
            while(sc.hasNextLine()){
                listLines.add(sc.nextLine());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null exception");
        }
        catch (FileNotFoundException e){
            System.out.println("Can't find file!");
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        int i = 0;
        String[] lists = new String[listLines.size()];
        for(String list : listLines){
            lists[i] = list;
            i++;
        }
        System.out.println(Arrays.toString(lists));

        int i1 = 0;
        for(String lines : lists){

            String[] tmp = lines.split(" ");
            purchases[i1].setName(tmp[0]);
            purchases[i1].setPrice(Double.parseDouble(tmp[1]));
            purchases[i1].setUnitNumber(Integer.parseInt(tmp[2]));
            i1++;
        }

        for(GeneralPurchase l : purchases){
            if(SUB_CONSTANT < l.getUnitNumber()){
                DiscountPurchaseWithConstant discountPurchaseWithConstant = new DiscountPurchaseWithConstant(l.getName(), l.getPrice(), l.getUnitNumber());
                Writer(discountPurchaseWithConstant);
            }
        }
    }


}
