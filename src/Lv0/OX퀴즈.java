package Lv0;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int result = Integer.parseInt(s[0]);

            if(s[1].equals("+")) {
                result += Integer.parseInt(s[2]);
            } else if(s[1].equals("-")) {
                result -= Integer.parseInt(s[2]);
            }

            if(result == Integer.parseInt(s[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}
