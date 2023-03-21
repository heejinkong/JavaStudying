package Java_kity.ch05.practice;

import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    };
    abstract  int calculate();
}

class Add extends Calc{
    public Add(){}
    int calculate() {
        return a+ b;
    }
}
class Sub extends Calc{
    public Sub(){}
    int calculate() {
        return a-b;
    }
}
class Mul extends Calc {
    public Mul(){}
    int calculate() {
        return a*b;
    }
}
class Div extends Calc{
    public Div(){}
    int calculate() {
        return a/b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = s.nextInt();
        int b = s.nextInt();
        char c = s.next().charAt(0);

        if(c=='+') {
            Add add = new Add();
            add.setValue(a, b);
            System.out.println(add.calculate());
        }
        if(c=='-') {
            Sub sub = new Sub();
            sub.setValue(a,b);
            System.out.println(sub.calculate());
        }
        if(c=='*') {
            Mul mul = new Mul();
            mul.setValue(a,b);
            System.out.println(mul.calculate());
        }
        if(c=='/') {
            Div div = new Div();
            div.setValue(a,b);
            System.out.println(div.calculate());
        }
    }

}
