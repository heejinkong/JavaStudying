package base.loop.loopEx;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 2;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
