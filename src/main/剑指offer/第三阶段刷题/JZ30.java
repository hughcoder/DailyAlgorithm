package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.Stack;

public class JZ30 {
    /**
     * initialize your data structure here.
     */

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public JZ30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            if (x <= minStack.peek()) {  //错在这个等号没取到 导致少数字，下面peek就为空了
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String args[]) {
        JZ30 minStack = new JZ30();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());   // --> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());   //  --> 返回 0.
        System.out.println(minStack.min()); // --> 返回 -2.
    }
}
