package algorithm;

public class 연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        System.out.println(solution(sequence, k));
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        answer[1] = Integer.MAX_VALUE;

        int start = 0;
        int sum = 0;

        for(int end = 0; end < sequence.length; end++) {
            sum += sequence[end];

            while(sum > k) {
                sum -= sequence[start];
                start++;
            }

            if(sum == k) {
                if((end-start) < (answer[1] - answer[0])) {
                    answer[0] = start;
                    answer[1] = end;
                }
            }
        }
        return answer;
    }
}
