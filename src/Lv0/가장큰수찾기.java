package Lv0;

public class 가장큰수찾기 {
    public static void main(String[] args) {
        int[] array = {1,8,3};
        System.out.println(solution(array));
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int n = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                n = i;
            }
        }
        answer[0] = max;
        answer[1] = n;
        return answer;
    }
}
