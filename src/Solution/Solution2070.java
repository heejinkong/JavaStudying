package Solution;

import java.util.Scanner;

public class Solution2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.print("#" + (i+1)+ " ");
            if(num1 > num2) {
                System.out.println(">");
            } else if (num1 < num2) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}
