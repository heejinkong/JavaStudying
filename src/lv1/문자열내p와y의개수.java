package lv1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        String[] sString = s.split("");

        for(int i = 0; i < sString.length; i++) {
            if(sString[i].equalsIgnoreCase("p")) {
                p++;
            } else if(sString[i].equalsIgnoreCase("y")) {
                y++;
            }
        }

        if(p != y) {
            answer = false;
        }

        return answer;

    }
}
