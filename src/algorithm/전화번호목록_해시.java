package algorithm;

import java.util.HashSet;
import java.util.Set;

public class 전화번호목록_해시 {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(String num : phone_book) {
            set.add(num);
        }

        for(String s : phone_book) {
            for(int i = 0; i < s.length(); i++) {
                String sub = s.substring(0,i);
                if(set.contains(sub)) return false;
            }
        }
        return true;
    }
}
