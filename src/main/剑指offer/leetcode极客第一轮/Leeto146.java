package main.剑指offer.leetcode极客第一轮;

import java.util.HashMap;

public class Leeto146 {
    static class LRUCache {
        //设计和实现一个  LRU (最近最少使用) 缓存机制
        //哈希表 + 双向链表

        private class ListNode {
            private int key;
            private int value;

            //前驱节点
            private ListNode pre;
            //后继节点
            private ListNode next;

            public ListNode(int key, int val) {
                this.key = key;
                this.value = val;
            }

        }

        private ListNode dummyHead;
        private ListNode dummyTail;
        private HashMap<Integer, ListNode> map;
        private int capacity;


        public LRUCache(int capacity) {
            map = new HashMap<>(capacity);
            this.capacity = capacity;
            dummyHead = new ListNode(-1, -1);
            dummyTail = new ListNode(-1, -1);
            dummyHead.next = dummyTail;
            dummyTail.pre = dummyHead;
        }

        public int get(int key) {
            return 0;
        }

        public void put(int key, int value) {

        }
    }

    public static void main(String args[]) {
        LRUCache cache = new LRUCache(2 /* 缓存容量 */);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

    }
}
