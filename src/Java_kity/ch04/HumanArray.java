package Java_kity.ch04;

class Human {
    String name;
    int age;
    double height, weight;
    public Human(String name) {
        this.name = name;
    }
}

public class HumanArray {
    public static void main(String[] args) {
        Human aHuman = new Human("홍길동");
        aHuman.age = 21;
        aHuman.height = 180.5;
        aHuman.weight = 73.2;

        System.out.println(aHuman.name + ", " +aHuman.age+ ", "+aHuman.height+", "+aHuman.weight);
    }
}
