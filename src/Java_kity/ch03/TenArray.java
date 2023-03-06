package Java_kity.ch03;

public class TenArray {
    public static void main(String[] args) {
        int tenArray [] = new int[10];
        int size = tenArray.length;
        System.out.println(size);
        int sum = 0;

        for(int i=0; i<size; i++){
            tenArray[i] = i+1;
            System.out.print(tenArray[i] + " ");
            sum += i+1;
        }
        System.out.println();
        System.out.println("1~10까지의 합은 " + sum);
    }
}
