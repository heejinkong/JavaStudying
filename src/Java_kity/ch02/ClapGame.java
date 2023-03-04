package Java_kity.ch02;

import java.util.Scanner;

public class ClapGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>> ");
        int number = scanner.nextInt();
        int num1 = number / 10 ;
        int num2 = number % 10 ;

        System.out.print("빅수");


        if(num2 == 3)
            System.out.print("짝");
        if(num2 == 6)
            System.out.print("짝");
        if(num2 == 9)
            System.out.print("짝");



        if(num1 == 3)
            if(num2 == 3)
                System.out.print("짝짝");
            else if (num2 == 6) {
                System.out.print("짝짝");
            }
            else if (num2 == 9) {
                System.out.print("짝짝");
            }

        if(num1 == 6)
            if(num2 == 3)
                System.out.print("짝짝");
            else if (num2 == 6) {
                System.out.print("짝짝");
            }
            else if (num2 == 9) {
                System.out.print("짝짝");
            }

        if(num1 == 9)
            if(num2 == 3)
                System.out.print("짝짝");
            else if (num2 == 6) {
                System.out.print("짝짝");
            }
            else if (num2 == 9) {
                System.out.print("짝짝");
            }


    }
}
