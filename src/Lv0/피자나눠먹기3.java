package Lv0;

public class 피자나눠먹기3 {
    public static void main(String[] args) {
        int slice = 4;
        int n = 12;
        System.out.println(solution(slice, n));
    }

    private static int solution(int slice, int n) {
        int answer = 0;
        if(n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }
}
