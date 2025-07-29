package DSA_Round2.Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean checkValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == '{' || letter == '(' || letter == '[') {
                stack.push(letter);
            } else if (letter == '}' && stack.peek() == '{'
                    || letter == ']' && stack.peek() == '['
                    || letter == ')' && stack.peek() == '(') {
                stack.pop();
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "({[]}";
        System.out.println(checkValid(str));

    }

}
