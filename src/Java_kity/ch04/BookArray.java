package Java_kity.ch04;

import java.util.Scanner;

class Book2 {
    String title, author;
    public Book2(String title, String author) { //생성자
        this.title = title;
        this.author = author;
    }
}
public class BookArray {
    public static void main(String[] args) {
        Book2 [] book = new Book2[2];

        Scanner scanenr = new Scanner(System.in);
        for(int i=0; i<book.length; i++){
            System.out.print("제목>>");
            String title = scanenr.nextLine(); // Scanner의 nextLine()으로 한 줄(빈칸 포함)을 하나의 문자열로 읽음
            System.out.print("저자>>");
            String author = scanenr.nextLine();
            book[i] = new Book2(title, author); //배열 원소 객체 생성
        }
        for(int i=0; i< book.length; i++)
            System.out.print("(" + book[i].title + "," + book[i].author + ")");

    }
}
