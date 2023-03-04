package Java_kity.ch02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오>> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1 + num2) > num3)
            System.out.println("삼각형이 됩니다.");
        else if ((num1 + num3) > num2) {
            System.out.println("삼각형이 됩니다.");
        } else if ((num2 + num3) > num1) {
            System.out.println("삼각형이 됩니다.");
        }
        else
            System.out.println("삼각형이 될 수 없습니다.");
    }
}
