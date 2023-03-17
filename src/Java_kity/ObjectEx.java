package Java_kity;

class Point5 { // 사실은 Object를 상속받고 있음
    private int x, y;
    public Point5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() { // 오버라이딩
        return "(" + x+ "," +y+")";
    }
}

public class ObjectEx {
    public static void print(Object obj) { //업캐스팅해서 전달받는다.
        Class c = obj.getClass();
        String name =  c.getName();
        System.out.println(name);
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
//        System.out.println(obj.getClass().getName());
    }
    public static void main(String[] args) {
        Point5 p = new Point5(2,3);
        print(p);
//        System.out.println(p); // p -> p.toString()
//        print(new String("hello"));
    }
}
