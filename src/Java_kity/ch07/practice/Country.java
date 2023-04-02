package Java_kity.ch07.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        HashMap<String, Integer> c = new HashMap<String, Integer>();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print("나라 이름과 인구를 입력하세요 >> ");
            String name = s.next();
            int person = s.nextInt();
            if(name.equals("그만"))
                break;
            c.put(name, person);
        }

        while(true){
            System.out.print("인구 검색 >> ");
            String name = s.next();

            if(name.equals("그만"))
                break;
            else if(c.get(name) == null)
                System.out.println(name + "은 없습니다.");
            else
                System.out.println(name + "의 인구는 "+ c.get(name));
        }
        System.out.println("종료");
    }
}
