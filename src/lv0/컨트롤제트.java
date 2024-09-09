package lv0;

public class 컨트롤제트 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] words = s.split(" ");

        for(int i = 0; i < words.length; i++) {
            if(words[i].equals("Z")) {
                answer -= Integer.parseInt(words[i-1]);
            } else {
                answer += Integer.parseInt(words[i]);
            }
        }

        return answer;
    }
}
