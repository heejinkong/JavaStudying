package Java_kity;

import java.util.Scanner;

public class ScannerEx {
    public static void main (String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신여부 입력");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // 키를 읽어 문자열 변환해줘.
        String city = scanner.next(); // 키를 읽어 문자열 변환해줘.
        int age = scanner.nextInt(); // 키를 읽어 정수로 변환해줘.
        double weight = scanner.nextDouble();// 키를 읽어 실수로 변환해줘
        boolean isSingle = scanner.nextBoolean(); // 키를 읽어 불린으로 변환해줘.

        System.out.println("이름은" + name + ",");
        System.out.println("도시는" + city + ",");
        System.out.println("나이는" + age + ",");
        System.out.println("체중은" + weight + ",");
        System.out.println("독신여부는" + isSingle + "이다.");

    }
}
