package Java_kity.ch03.practice;

public class SkewedArray3 {
    public static void main(String[] args) {
        double array[][] = {{1.1, 1.2, 1.2, 1.4},
                {2.1, 2.2},
                {3.1, 3.2, 1.2},
                {4.1}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j--)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
