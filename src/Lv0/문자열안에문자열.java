package Lv0;

public class 문자열안에문자열 {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(solution(str1, str2));
    }
    public static int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)) answer = 1;
        else answer = 2;
        return answer;
    }
}
