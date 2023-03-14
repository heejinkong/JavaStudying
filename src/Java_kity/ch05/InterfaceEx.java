package Java_kity.ch05;

interface  PhoneInterface {
    final int TIMEOUT = 10000; // 상수 필드 선언
    void sendCall(); // 추상 메소드
    void receiveCall(); //추상메소드
    default void printLogo() { // default 메소드
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
}


public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
    }

}
