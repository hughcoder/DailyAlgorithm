package main.剑指offer.leetcode极客第一轮;

import java.util.HashSet;

public class Leet142 {

    public ListNode detectCycle(ListNode head) {
        HashSet hashSet = new HashSet();
        while (head != null) {
            if (hashSet.contains(head)) {
                return head;
            }
            hashSet.add(head);
            head = head.next;
        }
        return head;
    }
}
