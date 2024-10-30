package SW.D2;
import java.util.Scanner;
import java.io.FileInputStream;

public class D2_1859 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            long[] df = new long[num];
            long sum = 0;
            for(int i = num - 1; i >= 0; i--) {
                int cost = sc.nextInt();
                df[i] = cost;
            }
            long max = 0;
            for(int i = 0; i < df.length; i++) {
                if(df[i] >= max) {
                    max = df[i];
                }
                sum += max - df[i];
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}
