import java.util.Stack;

class Solution {
    boolean solution(String s) {
        return isValidParentheses(s);
    }

    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop(); // 여는 괄호는 짝이 맞으므로 pop하여 제거
            }
        }

        return stack.isEmpty(); // 모든 여는 괄호에 대해 닫는 괄호가 매칭되어 스택이 비어있어야 유효한 괄호입니다.
    }
}