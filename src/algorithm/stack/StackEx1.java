package algorithm.stack;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        System.out.println(stackInt.peek());
        System.out.println(stackInt.isEmpty());

        stackInt.pop();
        stackInt.pop();
        stackInt.pop();

        stackInt.clear();
        System.out.println(stackInt.isEmpty());
    }
}
