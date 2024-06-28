package algorithm.week4;

public class pgs140107_hj {
    public static void main(String[] args) {
        int k = 2;
        int d = 4;
        System.out.println(solution(k, d));
    }

    public static long solution(int k, int d) {
        long answer = 0;

        for (int i = 0; i <= d; i+=k) {
            long d2 = (long)Math.pow(d,2);
            long i2 = (long)Math.pow(i,2);
            int a = (int)Math.sqrt(d2-i2);
            answer += (a/k) + 1;
        }

//        int sum = 0;
//
//
//        for(int i = 0; i <= d; i++) {
//            for(int j = 0; j <= d; j++) {
//                if(i%k == 0 && j%k== 0) {
//                    sum = i*i + j*j;
//                    if(sum <= d*d){
//                        answer++;
//                    }
//                }
//            }
//        }

        return answer;
    }
}
