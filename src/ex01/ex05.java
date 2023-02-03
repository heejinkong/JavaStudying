package ex01;

import java.util.Scanner;

/**
 * 별찍기 게임
 */
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {
                System.out.print("kong");
            }
            System.out.println("");
        }
    }
}
