package Java_kity.ch02;

import java.util.Scanner;

public class Rectangle2 {

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("직사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력하시오>> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print(inRect(x1,y1,100,100,200,200));
        System.out.print(inRect(x2,y2,100,100,200,200));

    }
}
