package lv0;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kString = Integer.toString(k);

        for(int n = i; n <= j; n++) {
            String s = Integer.toString(n);
            for(int idx = 0; idx < s.length(); idx++) {
                if(s.substring(idx, idx+1).equals(kString)) answer++;
            }
        }

        return answer;
    }
}
