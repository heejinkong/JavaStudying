package SW.D2;
import java.util.Scanner;
public class D2_1926 {
    public static int n;
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            String tmp = String.valueOf(i);

            if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
                for (int j = 0; j < tmp.length(); j++) {
                    if (tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
