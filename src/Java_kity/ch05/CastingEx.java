package Java_kity.ch05;

class Person2 {
    String name;
    String id;

    public Person2(String name) {
        this.name = name;
    }
}
    class Student2 extends Person2 {
        String grade;
        String department;

        public Student2 (String name) {
            super(name);
        }
}

public class CastingEx {
    public static void main(String[] args) {
//        Person2 p = new Person2("이재문");
        Person2 p;
        Student2 s = new Student2("이재문");
        p = (Person2)s;// 업캐스팅
        s = (Student2) p;

        System.out.println(p.name);
//        s.grade = "교수";
//        System.out.println(s.grade);

    }
}
