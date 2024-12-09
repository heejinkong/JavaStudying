package lv1;

public class pgs_12922 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"수", "박"};

        for(int i = 0 ; i < n; i++) {
            if(i % 2 == 0) {
                answer += arr[0];
            } else {
                answer += arr[1];
            }
        }
        return answer;
    }
}
