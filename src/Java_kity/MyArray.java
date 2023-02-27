package Java_kity;

import java.util.Scanner;

public class MyArray {
    public static  void pr(int [] a) {
        /*for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }*/
        for(int k : a) {
            System.out.print(k + " ");// k = a[i]의 읽어온 값
        }
    }

    public static int big(int [] a) {
        int max = a[0];

        for(int i=0; i<a.length; i++) {
            if(a[i] > max)
                max =a[i];
        }
        return max;

    }

    public static void read(int [] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }
    public static void main(String[] args) {
        int[] intArray; // 배열에 대한 레퍼런스 변수
        intArray = new int[5];

        // int [] intArray = new int [5];

        System.out.println("정수" + intArray.length + "개를 입력하세요");
        read(intArray);
        pr(intArray);
        int max = big(intArray);

        System.out.println("제일 큰 값은 " + max);


    }
}
