package Java_kity.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        int sum = 0;

        System.out.print("5개의 정수를 입력하세요>> ");
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

//     System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("평균은" + (double)sum/ arr.length);
    }
}
