package main.剑指offer.牛客第一轮错题;

import java.util.Stack;

//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
//保持基本功能不变，多了一个记录最小值的函数
public class JZ20 {
    //存入-2，0，-3


    Stack<Integer> stackMain = new Stack<>();// 正常存放数的栈
    Stack<Integer> stackMin = new Stack<>();//维持一个最小的栈，只存放特定范围的最小值

    public void push(int node) {
        stackMain.push(node);
        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            if (node < stackMin.peek()) {
                stackMin.push(node);
            }

        }

    }

    public void pop() {
        if (stackMain.peek() == stackMin.peek()) {
            stackMin.pop();
        }
        stackMain.pop();

    }
    //top和min需要用peek 不减少原栈
    public int top() {
        return stackMain.peek();
    }
    public int min() {
        return stackMin.peek();
    }

    public static void main(String args[]) {
        JZ20 minStack = new JZ20();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());  //  --> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());    //  --> 返回 0.
        System.out.println(minStack.min());

    }
}
