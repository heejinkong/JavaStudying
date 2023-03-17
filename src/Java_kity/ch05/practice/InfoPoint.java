package Java_kity.ch05.practice;

class Point {
    private int x,y;
    public Point(int x, int y) {
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

class ColorPoint2 extends Point {
    private String s;
    public ColorPoint2 (int x,int y,String s) {
        super(x, y);
        this.s = s;
    }
    public void setXY(int x, int y) {
        move(x,y);
    }
    public void setColor(String s) {
        this.s = s;
    }
    public String toString(){
        return s + "색의 (" + getX() + "," + getY() + ") 의 점";
    }
}

public class InfoPoint {
    public static void main(String[] args) {
        ColorPoint2 cp = new ColorPoint2(5,5,"Yellow");
        cp.setXY(10,20);
        cp.setColor("Red");
        String str = cp.toString();
        System.out.println(str+"입니다.");
    }
}
