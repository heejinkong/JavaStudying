package lv1;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {

        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }


        int[] answer = new int[arr.length-1];

        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }

            answer[idx++] = arr[i];
        }

        return answer;
    }
}
