package algorithm.list;

import java.util.Arrays;

public class ListEx1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(arr, arr.length - 2);
        int[] copyRange = Arrays.copyOfRange(arr, 1, 3);

        int[] arr2 = new int[10];
        Arrays.fill(arr2, 5);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(copyRange));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }
}
