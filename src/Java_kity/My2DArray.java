package Java_kity;

public class My2DArray {

    public static void print2d(int m[][]) {
        for (int  i=0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n[][]; //2차원 정수 배열을 가리키는 레퍼런스 배열 n 선언
        n = new int[3][4];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = i * j;
            }
        }
        print2d(n);

        }
    }
