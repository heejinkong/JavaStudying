package Java_kity.ch04;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("","");
        System.out.println("생성자 호출됨");
    }
    public Book(String title) { // 생성자
//          tilte = t;
//        author = "작자 미상";
        this(title, "작자미상");
    }
    public Book(String title, String author) { // 생성자
//        title = t;
//        author = a;
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
//        Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // 생성자 Book (String t, String a) 호출
//        Book loveStroy = new Book("춘향전"); // 생성자 Book(String t) 호출
//        System.out.println(littlePrince.title + " " + littlePrince.author);
//        System.out.println(loveStroy.title + " " + loveStroy.author);

        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
    }
}
