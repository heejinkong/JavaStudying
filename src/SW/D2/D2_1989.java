package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2_1989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine().trim());

        for(int t = 1; t <= caseNum; t++) {
            int answer = 0;
            String word = br.readLine().trim();

            char[] arr = new char[word.length()];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = word.charAt(i);
            }

            String reWord = "";
            for(int i = arr.length - 1; i >=0; i--) {
                reWord += arr[i];
            }

            if(word.equals(reWord)) {
                answer = 1;
            }

            System.out.println("#" + t + " " + answer);

        }
    }
}
