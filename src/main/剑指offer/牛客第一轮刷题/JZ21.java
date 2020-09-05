package main.剑指offer.牛客第一轮刷题;

import java.util.Stack;

public class JZ21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();

        int j = 0;//计数popA
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
