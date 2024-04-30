package Lv0;


import java.util.Arrays;

public class 삼각형의완성조건1 {
    public static void main(String[] args) {
        int[] sides = {199,72,222};
        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]){
            answer = 1;
        } else if (sides[0] + sides [1 ]  <= sides[2]) {
            answer = 2;
        }

        return answer;
    }
}
