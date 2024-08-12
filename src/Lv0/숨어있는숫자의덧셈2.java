package Lv0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 숨어있는숫자의덧셈2 {
    public static void main(String[] args) {
        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        String[] ms = my_string.split("[a-zA-Z]");
        System.out.println(Arrays.toString(ms));
        for(int i = 0; i < ms.length; i++) {
            answer += !ms[i].isEmpty() ? Integer.parseInt(ms[i]) : 0;
        }
        System.out.println(answer);
    }
}
