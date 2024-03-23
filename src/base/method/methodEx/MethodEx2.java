package base.method.methodEx;

public class MethodEx2 {
    public static void main(String[] args) {
        msg("Hello, world!", 3);
        msg("java", 5);
        msg("hi", 7);
    }

    public static void msg(String a, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(a);
        }
    }
}
