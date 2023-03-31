package Java_kity.ch07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class HashMapDic {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("영단어 입력>> ");
            String word = s.next();
            if(word.equals("exit"))
                break;
            String kor = dic.get(word);
            if(kor == null)
                System.out.println(word + "는 없는 단어입니다");
            else
                System.out.println(word + ":" + kor);
        }
        System.out.println("종료합니다......");
    }
}
