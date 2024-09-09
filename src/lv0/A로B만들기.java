package lv0;


import java.util.Arrays;

public class A로B만들기 {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
    }

    public static int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        return Arrays.equals(beforeArray, afterArray) ? 1 : 0;
    }
}
