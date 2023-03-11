package Java_kity.ch04.practice;

import java.util.Scanner;

class Grade {
    private int math;
    private int science;
    private int english;


    public Grade(int m, int s,int e) {
        this.math = m;
        this.science = s;
        this.english = e;
    }


    public int average() {
        return (math+science+english)/3;
    }
}

public class GradeAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입략>>");
        int math = s.nextInt();
        int science = s.nextInt();
        int english = s.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+ me.average());
    }
}
