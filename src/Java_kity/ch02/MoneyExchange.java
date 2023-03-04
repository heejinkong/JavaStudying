package Java_kity.ch02;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>> ");
        int money = scanner.nextInt();
        int num50000 = 0;
        int num10000 = 0;
        int num1000 = 0;
        int num100 = 0;
        int num50 = 0;
        int num10 = 0;
        int num1 = 0;


        if (money >= 50000) {
            num50000 = money / 50000;
            money = money%50000;
            System.out.println("오만원권 " + num50000 + "매");
        }

         if(money>=10000){
            num10000 = money / 10000;
            money = money%10000;
             System.out.println("만원권 " + num10000 + "매");
        }
        if(money>=1000){
            num1000 = money / 1000;
            money = money%1000;
            System.out.println("천원권 " + num1000 + "매");
        }
        if(money>=100){
            num100 = money / 100;
            money = money%100;
            System.out.println("백원 " + num100 + "개");
        }
        if(money>=50){
            num50 = money / 50;
            money = money%50;
            System.out.println("오십원 " + num50 + "개");
        }
        if(money>=10){
            num10 = money / 10;
            money = money%10;
            System.out.println("십원 " + num10 + "개");
        }

        if(money>=1){
            num1 = money / 1;
            money = money%1;
            System.out.println("일원 " + num1 + "개");
        }


    }
}
