package Java_kity.ch03.practice;

import java.util.Scanner;

public class ArraySubject {
    public static void main(String[] args) {
        String course [] = {"Java", "C++", "HTML5", "컴퓨더구조", "안드로이드"};
        int score [] = {65, 88, 76, 62, 55};

        while(true){
            System.out.print("과목 이름>>");
            Scanner s = new Scanner(System.in);
            String name = s.next();

            for(int i=0; i<score.length; i++) { // 사용자가 입력한 과목명
                if (course[i].equals(name)) { // 과목명이 course[i]의 문자열과 같은 경우
                    int n = score[i];
                    System.out.println(name+"의 점수는 "+n);
                }
            }
            if(name.equals("그만"))
                break;
        }
    }
}
