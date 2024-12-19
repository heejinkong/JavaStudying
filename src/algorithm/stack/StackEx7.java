package algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class StackEx7 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder answer = new StringBuilder();
       int T = Integer.parseInt(br.readLine());

       for(int i = 0; i < T; i++) {
           String word = br.readLine();
           for(String s : word.split(" ")) {
               Stack<String> stack = new Stack<>();

               for(char c : s.toCharArray()) {
                   stack.push(String.valueOf(c));
               }


               while(!stack.isEmpty()) {
                   answer.append(stack.pop());
               }

               answer.append(" ");


           }
           System.out.println(answer.toString().trim());
       }
    }
}
