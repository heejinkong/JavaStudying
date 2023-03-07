package Java_kity.ch03.practice;

import java.util.Scanner;

public class GameRSP {
    public static void main(String[] args) {
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String str[] = {"가위", "바위", "보"};
        int win = 0;


        while(true){
            int n = (int)(Math.random()*3); // n은 0,1,2 중에서 랸덤하게 결정
            System.out.print("가위 바위 보!>>");
            Scanner s = new Scanner(System.in);
            String user = s.next();
            System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n]);

            if(str[n].equals("가위")) { // 컴퓨터가 낸 것이 "가위"인지 비교하는 문
                if(user.equals("바위"))
                    System.out.println(" 사용자가 이겼습니다.");
                else if (user.equals("보")) {
                    System.out.println(" 컴퓨터가 이겼습니다.");
                }
                else
                    System.out.println(" 비겼습니다.");
            }
            if(str[n].equals("바위")) { // 컴퓨터가 낸 것이 "가위"인지 비교하는 문
                if(user.equals("보"))
                    System.out.println(" 사용자가 이겼습니다.");
                else if (user.equals("가위")) {
                    System.out.println(" 컴퓨터가 이겼습니다.");
                }
                else
                    System.out.println(" 비겼습니다.");
            }
            if(str[n].equals("보")) { // 컴퓨터가 낸 것이 "가위"인지 비교하는 문
                if(user.equals("가위"))
                    System.out.println(" 사용자가 이겼습니다.");
                else if (user.equals("바위")) {
                    System.out.println(" 컴퓨터가 이겼습니다.");
                }
                else
                    System.out.println(" 비겼습니다.");
            }

            if(user.equals("그만"))
                System.out.println("게임을 종료합니다...");

        }
    }
}
