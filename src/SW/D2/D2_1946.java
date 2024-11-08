package SW.D2;
import java.util.*;
import java.io.*;

public class D2_1946 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCase = Integer.parseInt(br.readLine());

        for(int t = 1; t <= numCase; t++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>();


            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                String alphabet = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                for(int j = 0; j < num; j++) {
                    list.add(alphabet);
                }
            }
            System.out.println("#" + t);

            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if((i+1) % 10 == 0) {
                    System.out.println();
                }
            }

            if (list.size() % 10 != 0) {
                System.out.println();
            }


        }
    }
}
