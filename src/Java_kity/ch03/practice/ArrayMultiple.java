package Java_kity.ch03.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayMultiple {
    public static void main(String[] args) {
        System.out.print("양의 정수를 10개 입력하세요>> ");
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();
        int s6 = s.nextInt();
        int s7 = s.nextInt();
        int s8 = s.nextInt();
        int s9 = s.nextInt();
        int s10 = s.nextInt();
        int tenArray[] = {s1 , s2, s3, s4, s5, s6, s7, s8,s9,s10};

        System.out.print("3의 배수는 ");
        for(int i=0; i<tenArray.length; i++){
            if(tenArray[i]%3==0)
                System.out.print(tenArray[i]+" ");
            else
                continue;
        }
    }
}
