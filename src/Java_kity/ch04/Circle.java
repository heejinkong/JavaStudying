package Java_kity.ch04;

public class Circle {
    int radius; // 원의 반지름
    String name; // 원의 이름 필드
    public Circle() { //매개 변수 없는 생성자
        radius = 1; name =""; //필드 초기화

    }
    public Circle(int r, String n) {// 매개 변수를 가진 생성자
        radius = r; name = n; //매개 변수로 필드 초기화
    }

    public double getArea() { // 원의 면적 계산 메소드
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle(10, "자바 피자"); //객체 생성, 반지름 10으로, 이름을 "자바피자'로 초기화

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle(); //객체 생성. 반지름을 1, 이름을 ""로 초기화

        donut.name = "도넛 피자"; // 이름 변경
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
