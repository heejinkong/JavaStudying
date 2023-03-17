package Java_kity.ch05.practice;

class Point2 {
    private int x,y;
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint3 extends Point2{
    private String s;
    public ColorPoint3() {
        super(0, 0);
        this.s = "BLACK";
    }
    public ColorPoint3(int x, int y) {
        super(x,y);
        this.s = "BLACK";
    }
    public String toString() {
        return s + "색의 (" + getX() + "," + getY() + ") 의 점";
    }
    public void setXY(int x, int y) {
        move(x,y);
    }
    public void setColor(String s){
        this.s = s;
    }

}

public class InfoPoint2 {
    public static void main(String[] args) {
        ColorPoint3 zeroPoint = new ColorPoint3();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint3 cp = new ColorPoint3(10, 10);
        cp.setXY(5,5);
        cp.setColor("Red");
        System.out.println(cp.toString()+"입니다.");

    }
}
