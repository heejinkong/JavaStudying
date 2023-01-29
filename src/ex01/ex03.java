package ex01;


import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);

        int n = kong.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
