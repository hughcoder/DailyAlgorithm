package main.剑指offer.第三阶段刷题;

import java.util.Stack;

public class JZ31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        int j =0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]){ //这里判空很重要
                j++;
                stack.pop();
                if(j == popped.length){
                    break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        JZ31 jz31 = new JZ31();
        int[] a = {1,0};
//        int[] b = {4, 3, 5, 1, 2};
        int[] b = {4, 5, 3, 2, 1};
        System.out.println(jz31.validateStackSequences(a, a));
    }
}
