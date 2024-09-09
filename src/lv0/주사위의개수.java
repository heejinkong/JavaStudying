package lv0;

public class 주사위의개수 {
    public static void main(String[] args) {
        int[] box = {1,1,1};
        int n = 1;
        System.out.println(solution(box, n));
    }

    private static int solution(int[] box, int n) {
        int answer, w, h, d = 0;
        w = box[0] / n;
        h = box[1] / n;
        d = box[2] / n;
        answer = w * h * d;
        return answer;
    }
}
