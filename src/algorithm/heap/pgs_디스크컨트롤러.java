package algorithm.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class pgs_디스크컨트롤러 {
    public static void main(String[] args) {
        int[][] jobs = {{0,3}, {1,9}, {2,6}};
        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs) {
        //시작 시간 순으로 정렬 (j1[0] 기준으로 오름차순 정렬)
        Arrays.sort(jobs, Comparator.comparingInt(j -> j[0]));

        // 처리해야 할 작업 중 가장 소요시간이 짧은 작업 선택 (j1[1] 기준으로 오름차순 정렬)
        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(j -> j[1]));
        int currentTime = 0; // 현재 시간
        int completedJobs = 0; // 완료된 작업의 수 추적
        int totalResposeTime = 0; // 모든 작업의 총 응답 시간 기록
        int jobInedx = 0; // 현재 처리 중인 작업의 인덱스 추적

        //현재 시간까지 도착한 모든 작업을 큐에 추가
        while(completedJobs < jobs.length) {
            while(jobInedx < jobs.length && jobs[jobInedx][0] <= currentTime) {
                pq.add(jobs[jobInedx]);
                jobInedx++;
            }
            //작업 처리
            if(!pq.isEmpty()) {
                int[] job = pq.remove(); // 가장 짧은 작업을 꺼내어 처리
                currentTime += job[1];
                totalResposeTime += currentTime - job[0];
                completedJobs++;
            } else{
                currentTime = jobs[jobInedx][0];
            }
        }
        return totalResposeTime / jobs.length;
    }
}
