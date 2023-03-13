package Java_kity.ch05;

class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint extends Point {
    private  String color;
    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }


    public void show() { // 오버라이딩
        super.show();
        System.out.print(color);
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        p.show();

        p = new ColorPoint(1,2,"red"); // 업캐스팅
        p.show();
    }
}
