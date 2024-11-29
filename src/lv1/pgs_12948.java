package lv1;

public class pgs_12948 {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = String.valueOf(phone_number).split("");
        int len = phone_number.length();

        for(int i = 0; i < len; i++) {
            if(i >= len-4) {
                answer += arr[i];
            } else {
                answer += "*";
            }
        }
        return answer;
    }
}
