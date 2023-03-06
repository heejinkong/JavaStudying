package Java_kity.ch03.practice;

public class ArrayAverage {
    public static void main(String[] args) {
        System.out.print("랜덤한 정수들 : ");
        int arr[] = new int[10];
        int sum=0;

        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 10 + 1); //1에서 10까지 범위의 정수를 랜덤하게 생성
            arr[i]=n;
            sum += n;
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("평균은 " + (double)sum/ arr.length);

    }
}
