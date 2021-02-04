package main.剑指offer.第三阶段刷题;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class JZ59_2 {
    public JZ59_2() {

    }
    //请定义一个队列并实现函数 max_value 得到队列里的最大值，//队列先进先出
    // 要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> maxQueue = new LinkedList<>(); //维护一个最大值的队列
    public int max_value() {
        if(maxQueue.isEmpty()){
            return -1;
        }
        return maxQueue.peek();
    }

    public void push_back(int value) {
        queue.add(value);
        while(!maxQueue.isEmpty() && maxQueue.peekLast() < value)
            maxQueue.pollLast();
        maxQueue.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        if(queue.peek().equals(maxQueue.peekFirst()))
            maxQueue.pollFirst();
        return queue.poll();
    }


}
