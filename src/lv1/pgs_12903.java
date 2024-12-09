package lv1;

public class pgs_12903 {
    public String solution(String s) {
        String answer = "";
        String[] arr = String.valueOf(s).split("");
        int num = 0;
        if(s.length() % 2 == 0 ){
            num = s.length() / 2 - 1;
            for(int i = num; i <= num + 1; i++) {
                answer += arr[i];
            }
        } else {
            num = (s.length() / 2) + (s.length() % 2) - 1;
            answer += arr[num];
        }
        return answer;
    }
}
