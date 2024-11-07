package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2_1948 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCase = Integer.parseInt(br.readLine());
        int[] calendar = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int t = 1; t <= numCase; t++) {
            String[] input = br.readLine().split(" ");
            int month1 = Integer.parseInt(input[0]);
            int day1 = Integer.parseInt(input[1]);
            int month2 = Integer.parseInt(input[2]);
            int day2 = Integer.parseInt(input[3]);

            int sum = 0;

            for(int i = month1; i <= month2 ; i++) {
                if(i == month1) {
                    sum += calendar[i] - day1 + 1;
                } else if (i == month2) {
                    sum += day2;
                } else {
                    sum += calendar[i];
                }
            }
            System.out.println("#" + t + " " + sum);


        }
    }
}
