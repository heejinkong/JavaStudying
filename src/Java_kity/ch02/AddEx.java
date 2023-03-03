package Java_kity.ch02;

import java.util.Scanner;

public class AddEx {

    public static int sum(int n, int m) {
        return n + m ;
    }
    public static void main(String[] args) {
        System.out.println("두개의 정수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("두 정수의 합은 " + sum(a,b) + "입니다.");

    }
}
