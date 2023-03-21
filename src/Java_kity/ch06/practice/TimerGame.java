package Java_kity.ch06.practice;

import java.util.Calendar;
import java.util.Scanner;

class Enter{
    private Scanner s;
    private Calendar now;
    private String enter;
    private int time;
    public int enter() {
        s = new Scanner(System.in);
        enter = s.nextLine();
        now = Calendar.getInstance();
        time = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = "+ time);
        return time;
    }
}

public class TimerGame {
    public static void main(String[] args) {
        String[] name = {"황기태", "이재문"};
        Enter enter = new Enter();
        int time1, time2;
        int[] time = new int[2];
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        for(int i = 0; i < 2; i++) {
            System.out.print(name[i] + "시작 <Enter>키 >>");
            time1 = enter.enter();
            System.out.print(name[i] + "10초 예상 후 <Enter>키 >>");
            time2 = enter.enter();
            if(time1 > time2)
                time[i] = (60 - time1) - time2;
            else
                time[i] = time1 - time2;
        }
        time[0] = Math.abs(time[0]);
        time[1] = Math.abs(time[1]);
        if(time[0] > time[1])
            System.out.println("황기태의 결과 "+time[0]+", 이재문의 결과 "+time[1]+", 승자는 황기태");
        else
            System.out.println("황기태의 결과 "+time[0]+", 이재문의 결과 "+time[1]+", 승자는 이재문");
    }
}
