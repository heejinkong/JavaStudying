package lv0;

public class 배열의유사도 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1,s2));
    }
    public static int solution(String[] s1, String[] s2) {
//        HashSet<String> set = new HashSet<>();
//        int total = s1.length + s2.length;
//        for(int i = 0; i < s1.length; i++) {
//            set.add(s1[i]);
//        }
//        for(int i = 0; i<s2.length; i++) {
//            set.add(s2[i]);
//        }
//
//        int answer = total-set.size();
//

        int answer = 0;
        String s2Str = "";
        for(String s:s2){
            s2Str += s+"_";
        }
        for(String s:s1){
            if(s2Str.contains(s)) answer++;
        }
        return answer;
    }
}