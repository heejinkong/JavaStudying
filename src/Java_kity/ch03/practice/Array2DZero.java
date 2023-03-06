package Java_kity.ch03.practice;

public class Array2DZero {
    public static void main(String[] args) {

        int arr [][] = new int[4][4];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if((i+j)%3==0)
                    arr[i][j]=0;
                else
                    arr[i][j]=(int)(Math.random()*10+1);
            }
        }

        //출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++)
                System.out.print(arr[i][j]+ "   ");
            System.out.println();
        }


    }
}
