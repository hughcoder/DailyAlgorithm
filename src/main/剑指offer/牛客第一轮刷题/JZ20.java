package main.剑指offer.牛客第一轮刷题;

import java.util.Stack;

public class JZ20 {

    //定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。

    Stack<Integer> a = new Stack();
    Stack<Integer> b = new Stack<>();
    int min = Integer.MAX_VALUE;
    int max = -Integer.MAX_VALUE;

    public void push(int node) {
      a.push(node);
      if(b.isEmpty() || node<b.peek()){
          b.push(node);
      }
    }

    public void pop() {
       if(a.pop().equals(b.peek())){
           b.pop();
       }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}
