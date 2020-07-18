package main.栈相关和队列;

import java.util.Stack;

//两个栈实现队列
public class Zj1 {
    public static Stack<Integer> stack1 = new Stack<Integer>();
    public static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        //因为是先进先出，所以必须要把stack2的所有东西都要先pop出去，才能继续存放数字，保证数字存放的顺序
      if(stack2.empty()){
          while (!stack1.empty()){
              stack2.push(stack1.pop());
          }
      }
      return stack2.pop();
    }


    public static void main(String args[]) {
        push(1);
        push(2);
        push(3);
        System.out.println("第一次" + pop());
//        System.out.println("第二次" + pop());
    }
}
