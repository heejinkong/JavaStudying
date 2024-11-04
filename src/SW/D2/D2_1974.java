package SW.D2;
import java.util.Scanner;

public class D2_1974 {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[][] map = new int[9][9];



        for(int test_case = 1; test_case <= T; test_case++)
        {
            int answer = 1;
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < 9; i++) {
                int  rowSum = 0;
                int colSum = 0;
                for(int j = 0; j < 9; j++) {
                    rowSum += map[i][j];
                    colSum += map[j][i];
                }

                if(rowSum != 45 || colSum != 45) {
                    answer = 0;
                    break;
                }
            }

            if(answer == 0) {
                System.out.println("#" + test_case + " " + answer);
                continue;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int squareSum = 0;
                    for (int x = i * 3; x < (i + 1) * 3; x++) {
                        for (int y = j * 3; y < (j + 1) * 3; y++) {
                            squareSum += map[x][y];
                        }
                    }

                    if (squareSum != 45) {
                        answer = 0;
                        break;
                    }
                }
                if (answer == 0) {
                    break;
                }
            }

            System.out.println("#" + test_case + " " + answer);

        }
    }
}
