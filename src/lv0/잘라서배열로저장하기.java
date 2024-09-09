package lv0;

import java.util.ArrayList;

public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        int num = my_str.length() / n;
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < my_str.length(); i++) {
            s += my_str.charAt(i);
            System.out.println(s);
            if (s.length() == n) {
                list.add(s);
                s = "";
            } else if (i == my_str.length() - 1) {
                list.add(s);
                s = "";
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}
