package Java_kity.ch02;

import java.util.Scanner;

public class InCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        double radius = scanner.nextDouble();

        double xstart = x1 - radius;
        double xend = x1 + radius;
        double ystart = y1 - radius;
        double yend = y1 + radius;

        System.out.print("점 입력> ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if(xstart<=x2 && x2<=xend) {
            if(ystart<=y2 && y2<=yend)
                System.out.println("점 (" + x2 + ", " + y2 + "는 원 안에 있다.");
            else
                System.out.println("점 (" + x2 + ", " + y2 + ")는 원 안에 없다.");
        }
    }
}
