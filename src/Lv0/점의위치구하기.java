package Lv0;

public class 점의위치구하기 {
    public static void main(String[] args) {
        int[] dot = {-7,9};
        System.out.println(Solution(dot));
    }
    public static int Solution(int[] dot) {
        int answer = 0;

        if(dot[0] < 0) {
            if(dot[1] < 0){
                answer = 3;
            } else {
                answer = 2;
            }
        } else {
            if(dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        }
        return answer;
    }
}
