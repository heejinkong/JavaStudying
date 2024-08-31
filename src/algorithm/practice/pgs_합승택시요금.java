package algorithm.practice;

import java.util.*;

public class pgs_합승택시요금 {
        public int solution(int n, int s, int a, int b, int[][] fares) {
            int answer = 0;

            Map<Integer, List<Edge>> graph = new HashMap<>();
            for (int i = 1; i < n + 1; i++) {
                graph.put(i, new ArrayList<>());
            }

            for (int[] fare : fares) {
                graph.get(fare[0]).add(new Edge(fare[1], fare[2]));
                graph.get(fare[1]).add(new Edge(fare[0], fare[2]));
            }

            int[] distanceStartS = dijkstra(graph, s, n);
            int[] distanceStartA = dijkstra(graph, a, n);
            int[] distanceStartB = dijkstra(graph, b, n);

            int cost = distanceStartS[a] + distanceStartS[b];
            for (int i = 1; i < n + 1; i++) {
                if (s == i) {
                    continue;
                }
                cost = Math.min(cost, distanceStartS[i] + distanceStartA[i] + distanceStartB[i]);
            }

            answer = cost;
            return answer;
        }

        public int[] dijkstra(Map<Integer, List<Edge>> graph, int start, int n) {
            int INF = Integer.MAX_VALUE;
            int[] distance = new int[n + 1];
            Arrays.fill(distance, INF);

            Queue<Edge> pq = new PriorityQueue<>();
            pq.add(new Edge(start, 0));
            distance[start] = 0;

            while (!pq.isEmpty()) {
                Edge cur = pq.remove();
                if (distance[cur.node] < cur.cost) {
                    continue;
                }

                List<Edge> edges = graph.get(cur.node);
                for (Edge next : edges) {
                    int nextCost = distance[cur.node] + next.cost;
                    if (nextCost < distance[next.node]) {
                        pq.add(new Edge(next.node, nextCost));
                        distance[next.node] = nextCost;
                    }
                }
            }

            return distance;
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
}
