package Java_kity;

import java.util.HashMap;
import java.util.Scanner;

public class HashEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("baby" , "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("영단어>> ");
            String word = s.next();
            if(word.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            // 해시맵에서 '키' word의 '값' kor 검색
            String kor = dic.get(word);
            if(kor == null)
                System.out.println(word + "는 없는 단어 입니다.");
            else
                System.out.println(kor);
        }
    }
}
