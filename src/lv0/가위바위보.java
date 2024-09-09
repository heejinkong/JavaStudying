package lv0;

public class 가위바위보 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }

    private static String solution(String rsp) {
        String answer = "";
        char s = '2';
        char r = '0';
        char p = '5';

        for(int i = 0; i < rsp.length(); i++) {
           if(rsp.charAt(i) == s) {
               answer += r;
           } else if(rsp.charAt(i) == r) {
               answer += p;
           } else if (rsp.charAt(i) == p) {
               answer += s;
           }
        }

        return answer;
    }
}
