package SW.D2;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D2_1288 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        for(int t = 1; t <= caseNum; t++) {
            int num = Integer.parseInt(br.readLine());
            String arr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

            Set<String> set = new HashSet<String>();
            int answer = 1;

            while(true) {
                String s = String.valueOf(num * answer);

                for(int i = 0; i < s.length(); i++) {
                    set.add(String.valueOf(s.charAt(i)));
                }
                answer++;

                if(Arrays.equals(arr, set.toArray())) {
                    break;
                }
            }
            System.out.println("#" + t + " " + num*(answer-1));
        }
    }
}
