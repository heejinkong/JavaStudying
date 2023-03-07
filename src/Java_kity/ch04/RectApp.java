package Java_kity.ch04;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.print(">>");
        Scanner s = new Scanner(System.in);
        rect.height = s.nextInt();
        rect.width = s.nextInt();
        System.out.println("사각형의 면적은 "+rect.getArea());
    }
}
