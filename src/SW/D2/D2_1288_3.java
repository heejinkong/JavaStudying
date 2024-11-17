package SW.D2;

import java.io.*;
import java.util.*;

public class D2_1288_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int teatCase = Integer.parseInt(br.readLine());

        for(int t = 1; t <= teatCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            Set<Character> set = new HashSet<>();
            int cnt = 1;
            int target = 0;

            while (set.size() < 10) {
                target = N * cnt;
                String sTarget = String.valueOf(target);

                for(int i = 0; i < sTarget.length(); i++) {
                    set.add(sTarget.charAt(i));
                }
                cnt++;
            }
            System.out.println("#" + t + " " + target);
        }
    }
}
