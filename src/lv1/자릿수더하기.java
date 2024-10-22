package lv1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String nString = Integer.toString(n);

        for(int i=0; i < nString.length(); i++) {
            answer += Integer.parseInt(nString.substring(i, i+1));
        }


        return answer;
    }
}
