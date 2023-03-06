package Java_kity.ch03;

public class SkewedArray2 {
    public static void main(String[] args) {

        int array [][] = new int[4][];
        array [0] = new int[] {0, 1, 2, 3};
        array [1] = new int[] {4};
        array [2] = new int[] {5};
        array [3] = new int[] {6, 7, 8, 9};



        for(int i=0; i< array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
