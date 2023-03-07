package Java_kity.ch03.practice;

public class ClapGame {
    public static void main(String[] args) {
        int n10, n1;

        //1-99
        for (int i = 1; i <= 99; i++) {
            n10 = i / 10;
            n1 = i % 10;

            if (n10 != 0 && n10 % 3 == 0) { //10의자리가 	0이 아니고 3의 배수일 때
                if (n1 != 0 && n1 % 3 == 0)
                    System.out.println(i + "  박수 짝짝");
                else if (n1 == 0)
                    System.out.println(i + "  박수 짝");

            } else {  //10의 자리가 0일 때
                if (n1 != 0 && n1 % 3 == 0)
                    System.out.println(i + "  박수 짝");
            }

        }
    }
}