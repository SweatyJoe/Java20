package by.gsu.pms;

public class WriterInfo {
    public static void Writer(Object o){
        System.out.println(o.toString() + "\n");
    }
    public static void Writer(Object[] o){
        for(Object line : o){
            System.out.println(line.toString());
        }
        System.out.println("\n");
    }
}
