package Java_kity.ch04;

public class ArraySum {
    static void getSum (double n[]) {
        double sum = 0;
        for(int i=0; i< n.length; i++) {
            sum += n[i];
            System.out.println(n[i]);
        }
        System.out.printf("배열의 합은 " + "%.1f ",sum);
    }
    public static void main(String[] args) {
        double arry[] = {1.1, 2.2};
        getSum(arry);

    }
}
