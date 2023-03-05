package Java_kity.ch03;

public class Star {
    public static void main(String[] args) {

//        for(;;);

//        for(int i=0; i<5; i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=5; k>i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for문
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //while문
        int i = 0;
        while(i<5){
            i++;
            int j=6;
            while(j>i){
                j--;
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
