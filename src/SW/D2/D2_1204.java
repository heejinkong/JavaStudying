package SW.D2;
import java.util.Scanner;
import java.io.FileInputStream;

public class D2_1204 {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int caseNum = sc.nextInt();
            int[] scores = new int[101];

            for(int i = 0; i < 1000; i++) {
                int num = sc.nextInt();
                scores[num]++;
            }

            int max = 0;
            int idx = 0;
            for(int i = 0; i < scores.length; i++) {
                if(scores[i] >= max) {
                    max = scores[i];
                    idx = i;
                }
            }

            System.out.println("#" + caseNum + " " + idx);



        }
    }
}
