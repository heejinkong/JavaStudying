package SW.D2;

import java.io.*;

public class D2_2007_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        for(int t = 1; t <= caseNum; t++) {
            String word = br.readLine();

            for(int i = 1; i < word.length(); i++) {
                String b = word.substring(0, i);
                String c = word.substring(i , i + b.length());

                if(b.equals(c)) {
                    System.out.println("#" + t + " " + b.length());
                    break;
                }
            }
        }
    }
}
