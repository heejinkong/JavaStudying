package lv1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int num = 0;


        while(num < 10) {
            boolean isMissing = true;
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] == num) {
                    isMissing = false;
                    break;
                }
            }
            if(isMissing) {
                answer += num;
            }
            num++;
        }
        return answer;
    }
}
