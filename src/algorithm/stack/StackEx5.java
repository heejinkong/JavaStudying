package algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class StackEx5 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int tmp = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();



        for(int i = 0 ; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            while (tmp <= num) {
                stack.push(tmp);
                sb.append("+\n");
                tmp++;
            }
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println(sb);
    }
}