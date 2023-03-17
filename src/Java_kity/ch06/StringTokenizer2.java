package Java_kity.ch06;

import java.util.StringTokenizer;

public class StringTokenizer2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        StringTokenizer ts = new StringTokenizer("냉장고.세탁기.에어컨.TV.오디오", ".");

        while (st.hasMoreTokens()) {// 토큰이 있는 동안
            System.out.println(st.nextToken());
            System.out.println(ts.nextToken());
    }

    }
}
