package SW.D2;

import java.io.*;

public class D2_1986 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        for(int t = 1; t <= caseNum; t++) {
            int num = Integer.parseInt(br.readLine());
            int sum = 0;

            for(int i = 1; i <= num; i++) {
                if( i % 2 != 0) {
                    sum += i;
                } else {
                    sum -= i;
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}
