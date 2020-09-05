package main.剑指offer.牛客第一轮错题Re;

import java.util.Stack;

public class JZ21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int k = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[k]) {  //循环到最后一个之后还会做一个判断 需要判空
                k++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        JZ21 jz21 = new JZ21();

        int[] a = {1};
        int[] b = {1};
        jz21.IsPopOrder(a, b);
    }
}
