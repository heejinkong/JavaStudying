package Java_kity.ch02;

import java.util.Scanner;

public class RockScissorsPaperSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가위 바위 보 중 하나를 입력하세요: ");
        String in = scanner.next();

        switch (in) {
            case "가위":
                System.out.println(1); break;

            case "바위":
                System.out.println(2); break;
            case "보":
                System.out.println(3); break;
            default:
                System.out.println(0); break;
        }
    }
}
