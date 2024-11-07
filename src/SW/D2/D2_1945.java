package SW.D2;

import java.io.*;

public class D2_1945 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());
        int[] sNum ={2, 3, 5, 7, 11};


        for(int t = 1; t <= caseNum; t++) {
            int num = Integer.parseInt(br.readLine());
            int[] result = new int[sNum.length];
            for(int i = 0; i < sNum.length; i++) {
                while(num % sNum[i] == 0) {
                    num = num / sNum[i];
                    result[i]++;
                }
            }
            System.out.print("#" + t + " ");
            for(int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
