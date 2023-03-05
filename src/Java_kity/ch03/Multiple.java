package Java_kity.ch03;

public class Multiple {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<100; i++){
            if(i%3==0){
                System.out.print(i+ " ");
                sum += i;
            }

        }
        System.out.println();
        System.out.println("3의 배수의 합은 " + sum);
    }
}
