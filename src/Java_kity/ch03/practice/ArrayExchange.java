package Java_kity.ch03.practice;

import java.util.Scanner;

public class ArrayExchange {
    public static void main(String[] args) {
        System.out.print("금액을 입력하시오>> ");

        int[] unit = {50000, 10000, 1000, 100, 10, 1}; // 환산할 돈의 종류
        int m=0;


        Scanner s = new Scanner(System.in);
        int money = s.nextInt();

        for(int i=0; i<unit.length; i++) {
            m=money/unit[i];
            money%=unit[i];
            System.out.println(unit[i]+"원 짜리 : "+m+"개");
        }

    }
}
