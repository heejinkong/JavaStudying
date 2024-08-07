package algorithm;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> maps = new HashMap<>();

        for(String p : participant) {
            maps.put(p, maps.getOrDefault(p, 0)+1);
        }

        for(String c : completion) {
            maps.put(c, maps.get(c) -1);
        }

        for(String key : maps.keySet()) {
            if(maps.get(key) != 0) {
                return key;
            }
        }
        return null;
    }
}
