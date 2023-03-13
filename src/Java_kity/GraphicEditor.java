package Java_kity;

abstract class Shape { // 추상클래스
    Shape next;
    public Shape() {
        next = null;
    }
    abstract public void draw(); // 추상 메소드 선언
}

class Line extends Shape {
    public void draw() { // 추상 메소드를 반드시 오버라이딩 해야 한다.
        System.out.println("Line");
    }
    public void show() {
        System.out.print("~~~~~~");
    }
}

class Circleee extends Shape {
    public void draw() { // 오버라이딩
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    public void draw() { // 오버라이딩
        System.out.println("Rect");
    }
}

public class GraphicEditor {

    public static void print(Shape p) { // p는 Shape 객체이거나 Shape을 상속받은 객체에 대한 레퍼런스
        if(p instanceof Line) {
            Line l = (Line)p; // 다운캐스팅
            l.show();
        }
        p.draw();
    }
    public static void paint(Shape p) {
        while(p != null) {
            p.draw(); //동적 바인딩
            p = p.next;
        }
    }
    public static void main(String[] args) {
        Shape start, last, obj;

        start = new Line(); // 업캐스팅
        last = start;

        obj = new Rect();
        last.next = obj;
        last =obj;

        obj = new Line();
        last.next = obj;
        last =obj;

        obj = new Circleee();
        last.next = obj;
        last =obj;

        paint(start);


//        Line line = new Line();
//        Shape shape = line; // 업캐스팅
//
//        line.draw(); // Line 클래스의 draw() 호출
//        shape.draw(); // Shape 클래스의 draw() 호출 -> 동적바인딩에의해 Line 클래스의draw() 실행
//
//        print(shape);
//        print(new Circleee());
//        print(new Rect());
    }
}
