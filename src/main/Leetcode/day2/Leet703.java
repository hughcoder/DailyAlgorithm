package main.Leetcode.day2;

//703. 数据流中的第K大元素

//两种方法 一种快排   nlogn
//一种优先队列  minheap log2n
import java.util.PriorityQueue;

public class Leet703 {
    private PriorityQueue<Integer> queue; //优先队列 时间复杂度比短
    private int k;

    public Leet703(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue(k);
        for (int i = 0; i < nums.length; i++) {
           add(nums[i]);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }

}
