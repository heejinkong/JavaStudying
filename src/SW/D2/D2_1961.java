package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1961 {
    static  int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int caseNum = Integer.parseInt(br.readLine());

        for(int i = 1; i <= caseNum; i++) {
            N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];

            for(int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k = 0; k < N; k++) {
                    map[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] map_90 = Rotation(map);
            int[][] map_180 = Rotation(map_90);
            int[][] map_270 = Rotation(map_180);

            System.out.println("#" + i);
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    System.out.print(map_90[j][k]);
                }
                System.out.print(" ");

                for(int k = 0; k < N; k++) {
                    System.out.print(map_180[j][k]);
                }
                System.out.print(" ");

                for(int k=0; k< N; k++) {
                    System.out.print(map_270[j][k]);
                }
                System.out.println();
            }
        }
    }

    public static int[][] Rotation(int[][] map) {
        int[][] result = new int[N][N];

        for(int j = 0; j < N; j++){
            for(int k = 0; k < N; k++) {
                result[j][k] = map[N-1-k][j];
            }
        }
        return result;
    }
}
