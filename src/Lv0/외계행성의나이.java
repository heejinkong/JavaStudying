package Lv0;

public class 외계행성의나이 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }

    private static String solution(int age) {
        String answer = "";

        String temp = Integer.toString(age);
        for(int i = 0; i < temp.length(); i++) {
            answer += (char)((char)temp.charAt(i) + 49);
        }

        return answer;
    }
}
