package lv0;

public class 배열뒤집기 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        System.out.println(solution(num_list));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}
