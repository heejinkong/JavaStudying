package algorithm.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class pgs42579_hj {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(solution(genres,plays));
    }
    //classic - 500, 150, 800
    // pop - 600, 2500

    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> music = new HashMap<>();

        for(int i = 0; i < genres.length; i++) { //pop=3100, classic=1450
            music.put(genres[i], music.getOrDefault(genres[i], 0) + plays[i]);
        }

        //1.장르 선정
        ArrayList<String> genres_ordered = new ArrayList<>();
        while(music.size() != 0) {
            int max = -1;
            String max_key = "";

            for(String key : music.keySet()) {
                int tmp_cnt = music.get(key);
                if(tmp_cnt > max) {
                    max = tmp_cnt;
                    max_key = key;
                }
            }
           genres_ordered.add(max_key);
            music.remove(max_key);
        }

        ArrayList<Music> result = new ArrayList<>();
        for(String gern : genres_ordered) {
            ArrayList<Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++) {
                if(genres[i].equals(gern)) {
                    list.add(new Music(gern, plays[i], i ));
                }
            }
            Collections.sort(list, ((o1, o2) -> o2.play - o1.play)); // 내림차순 sorting
            result.add(list.get(0)); // 1개는 무조건 수록
            if(list.size()!=1){ //더 수록할 곡이 있으면 (== 장르 내의 노래가 1개보다 많으면) 수록
                result.add(list.get(1));
            }
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).idx;
        }



        return answer;
    }
}
