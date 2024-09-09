package lv0;

public class 공던지기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int k = 2;
        System.out.println(Solution(numbers, k));
    }

    public static int Solution(int[] numbers, int k){
        int answer = 0;
        int idx = 0;

        for(int i = 1; i < k; i++) {
            idx += 2;
        }

        idx %= numbers.length;
        answer = numbers[idx];


        return answer;
    }
    
}
