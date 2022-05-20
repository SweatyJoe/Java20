package by.gsu.pms;

public class WriterInfo {
    public static void Writer(Object o){
        System.out.println(o.toString());
    }
    public static void Writer(Object[] o){
        for(Object line : o){
            System.out.println(line.toString());
        }
    }
}
