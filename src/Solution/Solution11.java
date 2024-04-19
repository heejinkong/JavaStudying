package Solution;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int sum = 0;
            for(int j = 0; j < 10; j++) {
                int num = sc.nextInt();
                if(num % 2 != 0) {
                    sum += num;
                }
            }
            System.out.println("#"+ (i+1) + " " + sum);
        }

    }
}
