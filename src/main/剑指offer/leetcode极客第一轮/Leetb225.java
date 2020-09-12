package main.剑指offer.leetcode极客第一轮;

import java.util.LinkedList;
import java.util.Queue;

//225. 用队列实现栈
public class Leetb225 {

    /**
     * Initialize your data structure here.
     */
    Queue<Integer> mainQueue;
    Queue<Integer> sub;

    public Leetb225() {
        mainQueue = new LinkedList<>();
        sub = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        mainQueue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        while (mainQueue.size() != 1){
            sub.add(mainQueue.poll());
        }
        int cur = mainQueue.poll();
        //归位
        while (!sub.isEmpty()){
            mainQueue.add(sub.poll());
        }
        return cur;
    }

    /**
     * Get the top element.  获取栈顶元素
     */
    public int top() {
        while (mainQueue.size() != 1){
            sub.add(mainQueue.poll());
        }
        int cur = mainQueue.poll();
        //归位
        while (!sub.isEmpty()){
            mainQueue.add(sub.poll());
        }
        mainQueue.add(cur);
        return cur;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return mainQueue.isEmpty();
    }

    public static void main(String args[]) {
        Leetb225 stack = new Leetb225();
        stack.push(1);
        stack.push(2);
        System.out.println("top--->"+stack.top());
        System.out.println(stack.pop());
    }

}
