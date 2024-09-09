package lv0;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(solution(array, height));
    }

    private static int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if(i > height) {
                answer++;
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] > height) {
//                answer++;
//            }
//        }
        return answer;
    }

}
