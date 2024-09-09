package lv0;

public class 모스부호 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }

    private static String solution(String letter) {
        String answer = "";

        String[] morse = {".-","-...","-.-.","-..",".","..-.", "--.","....","..",".---","-.-",".-..", "--","-.","---",".--.","--.-",".-.", "...","-","..-","...-",".--","-..-", "-.--","--.."};

        String words[] =letter.split(" ");
        for (String word : words) {
            for(int i = 0; i < morse.length; i++) {
                if(morse[i].equals(word)) {
                    answer += (char)(97 + i) + "";
                }
            }

        }

        return answer;
    }
}
