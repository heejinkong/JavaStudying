package algorithm.HS.week1;


import java.util.ArrayList;
import java.util.Arrays;

public class pgs_줄서는방법 {
    public static void main(String[] args) {
        int n = 4;
        int k = 5;
        System.out.println(Arrays.toString(solution(n, k)));
    }

    public static int[] solution(int n, int k) {
       ArrayList<Integer> list = new ArrayList<>();
       int[] result = new int[n];
       int fact = 1;
       for(int i = 1; i <= n; i++) {
           fact *= i;
           list.add(i);
       }
       k--;

       int idx = 0;
       while(n > 0) {
           fact /= n; //첫번째 숫자가 결정되면 남은 자리에 대한 순열
           result[idx++] = list.get((int) (k/fact)); // list에서 k번째 순열의 첫번째 숫자 선택
           list.remove((int)k/fact);// 이미 선택된 숫자를 다음 자리에서 선택되지 않도록 함
           k %= fact; // 남은 자리의 순서를 결정하기 위해 k 값 업데이트(-> 현재 자리의 순열이 고정된 후, 남은 순열에서 몇번째 순열인지 계산하기 위함)
           n--; //남은 자리의 수 줄임
       }
       return result;
    }
}
