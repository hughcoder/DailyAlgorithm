package main.剑指offer.第三阶段刷题;

import java.util.Stack;

public class JZ9 {

    class CQueue {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            //队列尾部插入整数
           stack.push(value);
        }

        public int deleteHead() {
            //在队列头部删除整数的功能
           if(!temp.isEmpty()){
               //不为空的话 直接取值
               return temp.pop();
           }
           if(stack.isEmpty()){
               return -1;
           }

           while (!stack.isEmpty()){
               temp.push(stack.pop());
           }
           return temp.pop();
        }
    }

}
