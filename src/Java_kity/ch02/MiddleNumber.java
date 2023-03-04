package Java_kity.ch02;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int middle = 0;

        if (num1 < num2 && num2 < num3) {
            middle = num2;
        }
        else if (num1 < num3 && num3 < num2) {
            middle = num3;
        }
        else if(num2<num1 && num1<num3){
            middle = num1;
        }

        System.out.println("중간 값은 " + middle);

    }
}
