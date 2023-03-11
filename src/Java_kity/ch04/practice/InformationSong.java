package Java_kity.ch04.practice;

class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    public Song() {

    }
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.println(year+"년 "+ country+"의 "+ artist+ "가 부른 "+title);
    }

}

public class InformationSong {
    public static void main(String[] args) {
        Song mySong = new Song("Dancing Queen", "ABBA", 1978,"스웨덴국적");
        mySong.show();
    }
}
