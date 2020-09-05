package main.剑指offer第一轮错题Re;

import java.util.Stack;

public class JZ20 {
    //定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if (stack.isEmpty()) {
            stack.push(node);
            minStack.push(node);
        } else {
            if (node <= minStack.peek()) {
                minStack.push(node);
            }
            stack.push(node);
        }
    }

    public void pop() {
        if (!minStack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
