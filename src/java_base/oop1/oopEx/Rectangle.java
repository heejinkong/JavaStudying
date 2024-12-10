package java_base.oop1.oopEx;

public class Rectangle {
    int width;
    int height;
    int area;

    int calculateArea() {
        return width * height;
    }
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare(){
        return width == height;
    }
}
