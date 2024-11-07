package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2_1970 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] result = new int[money.length];

        for(int t = 1; t <= caseNum; t++) {
            int cost = Integer.parseInt(br.readLine());

            for(int i = 0; i < money.length; i++) {
                result[i] = cost / money[i];
                cost = cost % money[i];
            }

            System.out.println("#" + t + " ");
            for(int i =0; i < 8; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
