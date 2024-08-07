package algorithm;

public class 연속부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        System.out.println(solution(sequence, k));
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0;
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;

        while(end < sequence.length) {
            sum += sequence[end];

            while (sum >= k && start <= end) {
                if(sum == k) {
                    if(end - start + 1 < min) {
                        min = end - start + 1;
                        answer[0] = start;
                        answer[1] = end;
                    }
                }
                sum -= sequence[start];
                start++;
            }
            end++;

        }
        return answer;
    }
    }
