package base.scanner.scannerEx;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if(option == 1) {
                sc.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String name = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int num = sc.nextInt();

                totalCost +=  price * num;
                System.out.println("상품명:" + name + "가격:" + price + "수량:" + num + " 합계:" + price * num);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}