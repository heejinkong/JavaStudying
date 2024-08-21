package algorithm.week11;

import java.util.*;
class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for(int i = 1; i <= n; i++){

            
            graph.put(i, new ArrayList<>());
        }
        for(int[] fare : fares){
            graph.get(fare[0]).add(new Edge(fare[1], fare[2]));
            graph.get(fare[1]).add(new Edge(fare[0], fare[2]));
        }
        // 각각의 노드에서 모든 노드로의 최단 거리를 계산
        int[] sDist = dijkstra(graph, s, n);
        int[] aDist = dijkstra(graph, a, n);
        int[] bDist = dijkstra(graph, b, n);
        int minCost = Integer.MAX_VALUE;
        // 모든 노드를 경유지로 고려하여 최소 비용 계산
        for(int i = 1; i <= n; i++){
            int cost = sDist[i] + aDist[i] + bDist[i];
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
    int[] dijkstra(Map<Integer,List<Edge>> graph, int start, int n) {
        int INF = Integer.MAX_VALUE;
        int[] distance = new int[n + 1];
        Arrays.fill(distance, INF);
        Queue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));
        distance[start] = 0;
        while(!pq.isEmpty()) {
            Edge cur = pq.remove();
            if(distance[cur.node] < cur.cost) continue;
            for(Edge next : graph.get(cur.node)) {
                int nextCost = distance[cur.node] + next.cost;
                if(nextCost < distance[next.node]) {
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