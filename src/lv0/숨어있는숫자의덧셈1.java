package lv0;

public class 숨어있는숫자의덧셈1 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-z]", "");
        String[] arr = my_string.split("");

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.valueOf(arr[i]);
        }
        return answer;
    }
}