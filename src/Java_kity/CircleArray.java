package Java_kity;

import java.util.Scanner;

class Circlee{
    int radius;
    public Circlee(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circlee [] c; //배열에 대한 레퍼런스 변수 c선언
        c = new Circlee [5];// 레퍼런스 배열을 생성
        for(int i=0; i<c.length; i++) {
            System.out.print((i+1) + ">>");
            int radius = scanner.nextInt();
            c[i] = new Circlee(i+1);
        }
        //생성과정 끝

        for(int i=0; i<c.length; i++) {
            System.out.println(c[i].getArea() + " ");
        }
    }

}
