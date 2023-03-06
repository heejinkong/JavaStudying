package Java_kity.ch03;

import java.util.Random;
import java.util.Scanner;

public class CardUpAndDown {
    public static void main(String[] args) {
        Random r = new Random();
        int k = r.nextInt(100); //0~99까지 임의의 정수 생성

        while (true) {
            System.out.println("수를 결하였습니다. 맞추어 보세요");
            System.out.println("0 - 99");
            int count = 0;


            for (int i = 0; true; i++) {
                count++;
                System.out.print(count + ">>");
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                
                if (num == k) {
                    System.out.println("맞았습니다.");
                    System.out.print("다시하시겠습니까? (y/n) ");
                    String text = scanner.next();
                    if (text.equals("n")) {
                        System.exit(0);
                    } else
                        break;
                } else if (num < k) {
                    System.out.println("더 높게");
                } else
                    System.out.println("더 낮게");



            }
        }

    }
}



