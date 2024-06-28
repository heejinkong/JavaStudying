package algorithm.q2;

class Man extends Person{
        int power;

        Man(String name, int age, int power) {
            super(name, age);
            this.power = power;
        }

        void run() {
            System.out.println(name + "이(가) 빠르게 달립니다.");
        }


}
