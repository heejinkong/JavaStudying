package SW.D3;

import java.io.*;
import java.util.*;

public class D3_1289 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int testCase = Integer.parseInt(br.readLine());

        for(int t = 1; t <= testCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            String target = st.nextToken();
            int temp = 0;

            for(int i = 0; i < target.length(); i++) {
                int cur = target.charAt(i) - '0';

                if(temp != cur) {
                    temp = cur;
                    cnt++;
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
