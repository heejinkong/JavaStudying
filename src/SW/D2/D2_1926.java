package SW.D2;
import java.util.Scanner;

public class D2_1926 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();

            // 각 테스트 케이스마다 한 줄에 출력
            for (int i = 1; i <= n; i++) {
                String tmp = String.valueOf(i);

                if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
                    // "3", "6", "9"이 포함된 경우 "-"를 출력
                    for (int j = 0; j < tmp.length(); j++) {
                        if (tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9') {
                            System.out.print("-");
                        }
                    }
                    System.out.print(" ");
                } else {
                    // 포함되지 않은 경우 숫자 출력
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // 각 테스트 케이스마다 줄바꿈
        }

        sc.close(); // Scanner 닫기
    }
}
