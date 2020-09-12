package main.剑指offer.leetcode极客第一轮;

import java.util.Stack;

public class Leetb20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '[' || c[i] == '{' || c[i] == '(') {
                stack.push(c[i]);
            }
            if (c[i] == '}' || c[i] == ']' || c[i] == ')') {
                if (!stack.isEmpty() && stack.peek() == '{' && c[i] == '}') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '[' && c[i] == ']') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '(' && c[i] == ')') {
                    stack.pop();
                } else {
                    stack.push(c[i]);
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String args[]) {
        Leetb20 stack = new Leetb20();

//        System.out.println(stack.isValid("()[]{}"));
//        System.out.println(stack.isValid("{[]}"));
//        System.out.println(stack.isValid("]"));
        System.out.println(stack.isValid("(])"));
    }
}
