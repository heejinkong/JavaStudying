package lv0;

public class 최빈값구하기HashMap {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1001];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<array.length; i++) {
            index[array[i]]++;
        }

        for(int i = 0; i < index.length; i++) {
            if(index[i] > max) {
                max = index[i];
                answer = i;
            } else if (max == index[i]) {
                answer = -1;
            }
        }


        return answer;
    }
}
