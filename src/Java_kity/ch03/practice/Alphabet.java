package Java_kity.ch03.practice;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char c = s.charAt(0);

        for(int i=0; i<=c-'a'; i++) {
            for (char j = 'a'; j <= c - i; j++)
                System.out.print(j);
            System.out.println();
        }

//        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
//        Scanner scanner = new Scanner(System.in);
//        //자바에서는 문자만 받는 것이 불가능. 문자열을 입력받고 charAt(0)을 통해서 첫번째 글자만 추출
//        char alpha = scanner.next().charAt(0);// 문자열의 첫 번째 문자
////
////
//        for(int i=0; i<=alpha-'a'; i++) {
//            for (char j = 'a'; j <= alpha - i; j++)
//                System.out.print(j);
//            System.out.println();
//        }
    }
}
