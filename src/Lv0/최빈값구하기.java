package Lv0;

public class 최빈값구하기 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int count [] = new int[1000+1];

        for(int i = 0; i < array.length; i++) {
            count[array[i]]++;
            if(max < count[array[i]]) {
                max = count[array[i]];
                answer = array[i];
            }
        }

        int temp = 0;
        for(int j = 0; j < 1001; j++) {
            if(max == count[j])
                temp++;
            if(temp > 1)
                answer = -1;
        }

        return answer;
    }
}
