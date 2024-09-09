package lv0;

public class 특정문자제거하기 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution(my_string,letter));
    }

    private static String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
    }
}
