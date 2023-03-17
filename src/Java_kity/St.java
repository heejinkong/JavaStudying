package Java_kity;
import java.util.StringTokenizer;

public class St {
    public static void main(String[] args) {
        String query = "name=heejin&add=seoul&age=24";
        StringTokenizer s = new StringTokenizer(query, "&");

        int n = s.countTokens();
        System.out.println(n);

//        for(int i=0; i<n; i++) {
//            String token = s.nextToken();
//            System.out.println(token);
//        }
//        while(s.hasMoreTokens()) {
//            String token = s.nextToken();
//            System.out.println(token);
//        }

        String[] sub = query.split("&"); //string의 배열 리턴
        for(int i = 0; i<sub.length; i++) {
            System.out.println(sub[i]);
        }
    }
}
