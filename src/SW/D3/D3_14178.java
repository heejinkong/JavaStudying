package SW.D3;

import java.util.Scanner;

public class D3_14178 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int  N=sc.nextInt();
            int D=sc.nextInt();
            int result=(N%(D*2+1)==0)?N/(D*2+1) : N/(D*2+1)+1;
            System.out.println("#"+test_case+" "+result);
        }
    }
}
