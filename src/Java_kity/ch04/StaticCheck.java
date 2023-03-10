package Java_kity.ch04;

public class StaticCheck {
     static int s;
    static int t;

    public static void main(String[] args) {
        StaticCheck.t =10;
        StaticCheck.s=20;
        StaticCheck obj = new StaticCheck();
        obj.s = 30;
        obj.t =40;
        System.out.println(obj.s);
        System.out.println(obj.t);
    }
}
