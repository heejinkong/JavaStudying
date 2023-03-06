package Java_kity.ch03.practice;

import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        System.out.print("정수 몇개? ");

        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int num[] = new int[count];

        for(int i=0; i<count; i++) {
            num[i] = (int) (Math.random() * 100 + 1);

            if(i>0) {
                for(int j=0; j<i; j++) {  //기존 배열에 있는 값일 경우 다시 초기화
                    if(num[i]==num[j]) {
                        num[i]=(int)(Math.random()*100+1);
                        j--;   //새로 들어온 값이 또 num[j]와 동일하지 않은지 검사
                    }
                }
            }
        }

        //값 출력
        for(int i=0; i<count; i++) {
            System.out.print(num[i]+"   ");
            if((i+1)%10==0)  //10개 기준으로 띄어쓰기
                System.out.println();
        }
    }
}
