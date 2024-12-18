package algorithm.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 여행경로 {
    public static boolean[] visited;
    public static ArrayList<String> allRoute;
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"},{"ATL", "ICN"},{"ATL","SFO"}};
        System.out.println(Arrays.toString(solution(tickets)));
    }

    public static  String[] solution(String[][] tickets) {
        String[] answer = {};
        
        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();
        
        dfs("ICN", "ICN", tickets, 0);

        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        
        return answer;
    }

    public static void dfs(String start, String route, String[][] tickets, int cnt) {
        if(cnt == tickets.length) {
            allRoute.add(route);
            return;
        }

        for(int i = 0; i < tickets.length; i++) {
            if(start.equals(tickets[i][0]) && !visited[i]) {
                visited[i]  = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
