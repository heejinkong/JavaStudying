package SW.D2;

import java.io.*;

public class D2_2007 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCase = Integer.parseInt(br.readLine());

        for(int t = 1; t <= numCase; t++) {
            String word = br.readLine();

            for(int i = 1; i < word.length(); i++) {  // '<=' 대신 '<'로 변경
                String b = word.substring(0, i);
                String c = word.substring(i, i + b.length());  // 길이가 b와 같은 부분을 확인

                if(b.equals(c)) {
                    System.out.println("#" + t + " " + b.length());
                    break;
                }
            }
        }
    }
}
