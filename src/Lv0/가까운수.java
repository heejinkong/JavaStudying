package Lv0;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);


            if(diff < min || (diff == min && array[i] < answer)) {
                min = diff;
                answer = array[i];
            }
        }

        return answer;
    }
}
