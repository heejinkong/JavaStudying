package algorithm;

public class 주식가격_투포인터 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(solution(prices));
    }
    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        int start;
        int end;

        for (start = 0; start < n ;start++) {
            end = start;
            while(prices[start] <= prices[end] && end < n -1 ) {
                end++;
            }
            answer[start] = end - start;
        }
        return answer;
    }
}
