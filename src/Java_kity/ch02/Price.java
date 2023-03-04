package Java_kity.ch02;

import java.util.Scanner;

public class Price {
    public static double exchange(double n) {
        return n /  1100 ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하세요 (단위 원): ");
        int $price = scanner.nextInt();

        System.out.println($price + "원은 $" + exchange($price) + "입니다.");

    }
}
