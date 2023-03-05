package Java_kity.ch02;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>> ");
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        int result = 0;

        if(operator.equals("+")) {
            result = num1 + num2;
            System.out.println(num1 + operator + num2 + "의 계산 결과는" + result);
        }
        else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println(num1 + operator + num2 + "의 계산 결과는" + result);
        }
        else if (operator.equals("%")) {
            result = num1 % num2;
            System.out.println(num1 + operator + num2 + "의 계산 결과는" + result);
        }
        else if (operator.equals("/")) {
            if(num2 != 0 ) {
                result = num1 / num2;
                System.out.println(num1 + operator + num2 + "의 계산 결과는" + result);
            }
            else
                System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
