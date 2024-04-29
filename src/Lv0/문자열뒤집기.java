package Lv0;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        String my_string ="jaron";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);
        String answer = str.reverse().toString();
//        for (int i = my_string.length()-1; i >= 0; i--) {
//            answer += my_string.charAt(i);
//        }
        return answer;
    }
}
