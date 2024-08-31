package algorithm.practice;
import java.util.*;

// 1.Map으로 인접 리스트 graph 생성
// 2.우선순위 큐를 생성해서 다익스트라 알고리즘
// 3.우선순위 큐에 노드 정보와 해당 노드까지의 거리 정보 저장
// 4.해당 노드까지의 거리 정보가 가장 짧은 노드 pop -> 해당 노드와 연결되어 있는 노드 탐색 및 push하며 최소 거리 갱신
// 5.노드까지의 거리 중 최댓값 return
public class leetCode_NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {

        // 1. 그래프 초기화
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for(int i = 1; i < n + 1; i++) {
            graph.put(i, new ArrayList<>());
        }

        // 2. 그래프에 각 경로와 가중치를 추가
        for (int[] time : times) {
            graph.get(time[0]).add(new Edge(time[1], time[2]));
        }

        // 3. 다익스트라 알고리즘 실행
        return dijkstra(graph, k, n, n);
    }

    public int dijkstra(Map<Integer, List<Edge>> graph, int start, int end, int n) {
        int INF = Integer.MAX_VALUE;
        int[] distance = new int[n + 1];
        Arrays.fill(distance, INF); // 모든 노드까지의 거리를 초기화

        // 우선순위 큐 생성
        Queue<Edge> pq = new PriorityQueue<>(); // 최소 힙
        pq.add(new Edge(start, 0)); // 시작 노드를 큐에 추가
        distance[start] = 0; // 시작 노드까지의 거리

        while (!pq.isEmpty()) {
            Edge cur = pq.remove();
            if (distance[cur.node] < cur.cost) {
                continue; // 이미 방문한 노드면 넘어감
            }

            List<Edge> edges = graph.get(cur.node); // 현재 노드와 연결된 노드를 가져오기
            for (Edge next : edges) {
                int nextCost = distance[cur.node] + next.cost;
                if (nextCost < distance[next.node]) {
                    pq.add(new Edge(next.node, nextCost)); // 최소 거리 갱신
                    distance[next.node] = nextCost; // 거리 배열 업데이트
                }
            }
        }

        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            if (distance[i] == INF) {
                return -1; // 도달할 수 없는 노드가 있다면 -1
            }
            if (distance[i] > result) {
                result = distance[i]; // 최대 거리 갱신
            }
        }

        return result;
    }
}

class Edge implements Comparable<Edge> {
    int node;
    int cost;

    public Edge(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.cost, other.cost);
    }

}