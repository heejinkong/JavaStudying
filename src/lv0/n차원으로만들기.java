package lv0;

public class n차원으로만들기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.println(Solution(num_list, n));
    }
    public static int[][] Solution(int[] num_list, int n){
        int size = num_list.length / n;
        int idx = 0;
        int[][] answer = new int[size][n];



        for(int i = 0; i <size; i++) {
           for(int j = 0; j < n; j++) {
               answer[i][j] = num_list[idx++];
           }
        }

        return answer;
    }
}
