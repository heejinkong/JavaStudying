package algorithm.q2;

public class SupermanUse {
    public static void main(String[] args) {
        Superman clark = new Superman("클라크 켄트", 30, 100, true);

        clark.eat();
        clark.run();
        clark.space();

        System.out.println(clark.toString());
    }
}

