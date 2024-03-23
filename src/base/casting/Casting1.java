package base.casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleVale;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);
        
        doubleVale = intValue; //int -> double
        System.out.println("doubleVale = " + doubleVale);

        doubleVale = 20L; //long -> double
        System.out.println("doubleVale2 = " + doubleVale);
    }
}
