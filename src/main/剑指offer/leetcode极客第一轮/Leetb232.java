package main.剑指offer.leetcode极客第一轮;

import java.util.Stack;

public class Leetb232 {

    /**
     * Initialize your data structure here.
     */
    Stack<Integer> stackMain;
    Stack<Integer> sub;

    public Leetb232() {
        stackMain = new Stack<>();
        sub = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stackMain.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (stackMain.size() != 1){
            sub.push(stackMain.pop());
        }

        int cur = stackMain.pop();
        while (!sub.isEmpty()){
            stackMain.push(sub.pop());
        }

        return cur;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (stackMain.size() != 1){
            sub.push(stackMain.pop());
        }

        int cur = stackMain.pop();
        stackMain.push(cur);
        while (!sub.isEmpty()){
            stackMain.push(sub.pop());
        }


        return cur;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stackMain.isEmpty();
    }
    public static void main(String args[]) {
        Leetb232 queue = new Leetb232();
        queue.push(1);
        queue.push(2);
        System.out.println("top--->"+queue.peek());
        System.out.println(queue.pop());
    }
}
