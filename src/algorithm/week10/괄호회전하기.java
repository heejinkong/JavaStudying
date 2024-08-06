package algorithm.week10;

import java.util.ArrayDeque;
import java.util.Deque;

public class 괄호회전하기 {
    public static void main(String[] args) {
        String s = "}]()[{";
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int answer = 0;
        String sb = s + s;

        for(int i = 0; i < s.length(); i++) {
            if(isValid(sb.substring(i, s.length() + i))) {
                answer++;
            }
        }
        return answer;
    }
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char cur : s.toCharArray()) {
            if(cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
            } else {
                if(stack.isEmpty()) return false;
                char target = stack.pop();
                if((target == '(' && cur != ')') ||
                        (target == '{' && cur != '}') ||
                        (target == '[' && cur != ']')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
