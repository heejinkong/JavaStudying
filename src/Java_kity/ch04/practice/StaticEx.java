package Java_kity.ch04.practice;

import java.util.Arrays;

class ArrayUnit {
    public static int [] concat(int[] a, int[] b) { // 배열 a와 b를 연결한 새로운 배열 리턴
        int n = a.length + b.length;
        int [] c = new int[n];

        for (int i=0; i<a.length; i++) {
            c[i] = a[i];
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for (int i=a.length; i<n; i++) {
            c[i] = b[i-4];
            System.out.print(c[i]+" ");
        }
        return c;

    }

    public static void print(int[] a) { // 배열 a 출력
        System.out.println();
        System.out.println(Arrays.toString(a));

    }
}

public class StaticEx {
    public static void main(String[] args) {
        int [] array1 = {1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUnit.concat(array1, array2);
        ArrayUnit.print(array3);

    }
}
