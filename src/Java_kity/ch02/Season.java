package Java_kity.ch02;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달을 입력하세요(1~12)>> ");
        int month = scanner.nextInt();

        if(3<=month && month<=5){
            System.out.println("봄");
        }
        else if (6<=month && month<=8) {
            System.out.println("여름");
        }
        else if (9<=month && month<=11) {
            System.out.println("가을");
        }
        else if (month == 12) {
            System.out.println("겨울");
        }
        else if (1<=month && month<=2) {
            System.out.println("겨울");
        }
        else
            System.out.println("잘못입력");
    }
}
