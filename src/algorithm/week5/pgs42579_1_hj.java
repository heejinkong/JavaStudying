package algorithm.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class pgs42579_1_hj {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(solution(genres,plays));
    }

    public static int[] solution(String[] genres, int[] plays) {
       HashMap<String, Integer> map = new HashMap<>();
       for(int i=0; i < genres.length; i++) {
           map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
       }

       ArrayList<String> genre = new ArrayList<>();
       for(String key :  map.keySet()) {
           genre.add(key);
       }
       Collections.sort(genre, (o1,o2) -> map.get(o2) - map.get(o1)); //key값에 해당하는 value를 내림차순으로 정렬

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < genre.size(); i++) {
            String g = genre.get(i);

            //해당 장르의 음악 중에서 play 횟수가 가장 큰 인덱스를 찾는다
            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            //해당 장르의 음악 중에서 play횟수가 두번째로 큰 인덱스를 찾는다
            max = 0;
            int secondIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    secondIdx = j;
                }
            }

            list.add(firstIdx);
            if(secondIdx >= 0)
                list.add(secondIdx); // secondIdx는 존재 할수도, 안할수도 있음
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
       return answer;
    }
}
