package algorithm.week7;

import java.util.HashSet;

public class pgs140904_hj {
    static HashSet<String> hashRelation;
    static boolean[] visited;
    static int len;
    public static void main(String[] args) {
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        System.out.println(solution(relation));
    }

    public static int solution(String[][] relation) {
        len = relation.length;
        hashRelation = new HashSet<>();
        visited = new boolean[len];

        backtrack(relation);
        int answer = 0;
        return answer;
    }

    public static void backtrack(String[][] relation){
//        for(int i = 0; i < relation.length; i++) {
//            for(int j)
//        }
    }
}
