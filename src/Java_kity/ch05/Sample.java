package Java_kity.ch05;

class SuperObject {
    public void paint() {
        draw();
    }
    public void draw() {
        draw();
        System.out.println("Super Object");
    }
}
class SubObject extends SuperObject {
    @Override
    public void paint() {
        super.draw();
    }
    @Override
    public void draw() {
        System.out.println("Sub Object");
    }
}
public class Sample {
    public static void main(String[] args) {
        SuperObject b = new SubObject();
        b.paint();
        System.out.println("************");
        SubObject a = new SubObject();
        a.paint();
    }
}
