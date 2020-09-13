package main.剑指offer.leetcode极客第一轮;

import java.util.*;

//703. 数据流中的第K大元素
public class Leetc703 {
    private PriorityQueue<Integer> queue; //默认排序

    int mk = 0;

    public Leetc703(int k, int[] nums) {
        mk = k;
        queue = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < mk) {
            queue.add(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}
