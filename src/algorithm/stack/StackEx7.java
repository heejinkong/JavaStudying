package algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class StackEx7 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (char c : word.toCharArray()) {
            stack1.push(String.valueOf(c));
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            if (command.equals("L")) {
                if (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            } else if (command.equals("D")) {
                if (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            } else if (command.equals("B")) {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else if (command.startsWith("P")) {
                String[] parts = command.split(" ");
                if (parts.length == 2) {
                    stack1.push(parts[1]);
                }

            }
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        StringBuilder answer = new StringBuilder();
        while (!stack2.isEmpty()) {
            answer.append(stack2.pop());
        }

        System.out.println(answer);
    }
}
