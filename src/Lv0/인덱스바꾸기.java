package Lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));
    }
    public static String solution(String my_string, int num1, int num2) {
//        char[] arr = my_string.toCharArray();
//
//        arr[num1] = my_string.charAt(num2);
//        arr[num2] = my_string.charAt(num1);

//        String answer = String.valueOf(arr);

        List<String> list = new ArrayList<>(List.of(my_string.split("")));
        Collections.swap(list, num1, num2);

        String answer = String.join("", list);
        return answer;
    }
}
