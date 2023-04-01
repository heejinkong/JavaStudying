package Java_kity.ch07.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Character> grade = new ArrayList<Character>();

        System.out.print("6개 학점 >>");
        for(int i=0; i<6; i++){
            char a = s.next().charAt(0);
            grade.add(Character.valueOf(a));
        }

        double sum = 0;
        for(int i=0; i<6; i++) {
            if(grade.get(i).equals('A'))
                sum += 4.0;
            if(grade.get(i).equals('B'))
                sum += 3.0;
            if(grade.get(i).equals('C'))
                sum += 2.0;
            if(grade.get(i).equals('D'))
                sum += 1.0;
            if(grade.get(i).equals('F'))
                sum += 0.0;
        }
        System.out.println("평균은 "+sum / 6 + "입니다.");
    }
}
