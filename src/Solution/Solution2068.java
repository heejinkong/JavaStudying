package Solution;

import java.util.Scanner;

public class Solution2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i < 3; i++) {
            int max = 0;
            for(int j = 0; j < 10; j++){
                int num = sc.nextInt();
                if(num > max) {
                    max = num;
                }
            }
            System.out.println("#" + (i+1) + " "+ max);
         }
    }
}
