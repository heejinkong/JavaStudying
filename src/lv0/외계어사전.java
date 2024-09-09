package lv0;

public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    cnt++;
                }

                if(cnt == spell.length) {
                    return 1;
                }
            }

        }
        return 2;
    }
}
