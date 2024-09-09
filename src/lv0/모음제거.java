package lv0;

public class 모음제거 {
    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer = my_string;
        String[] vowels = {"a" , "e", "i", "o", "u"};

        for (String vowel : vowels) {
            answer = answer.replaceAll(vowel, "");
        }
        return answer;
    }
}
