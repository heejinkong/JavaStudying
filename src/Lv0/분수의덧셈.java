package Lv0;

public class 분수의덧셈 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        System.out.println(solution(numer1, denom1, numer2,denom2 ));
    }

    private static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int commonNumer1 = numer1 * denom2;
        int commonNumer2 = numer2 * denom1;
        int commonNumer = commonNumer1 + commonNumer2;
        int commonDen = denom1 * denom2;

        int gcd = 0;

        //최대공약수
        for(int i = 1; i <= commonNumer && i <= commonDen; i++) {
            if(commonNumer % i == 0 && commonDen % i == 0) {
                gcd = i;
            }
        }

        commonNumer = commonNumer/gcd;
        commonDen = commonDen/gcd;

        int[] answer = {commonNumer, commonDen};


        return answer;
    }
}
