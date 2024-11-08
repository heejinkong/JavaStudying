package SW.D2;
import java.io.*;
import java.util.*;

public class D2_1288_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        for(int t = 1; t <=caseNum; t++) {
            int num = Integer.parseInt(br.readLine());
            Set<Character> set = new HashSet<>();
            int cnt = 1;

            int answer = 0;
            while (set.size() < 10) {
                answer = num * cnt;
                String sCur = String.valueOf(answer);

                for(int i = 0; i < sCur.length(); i++) {
                    set.add(sCur.charAt(i));
                }
                cnt++;
            }

            System.out.println("#" + t + " " + answer);
        }

    }
}
