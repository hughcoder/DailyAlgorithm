package main.剑指offer.leetcode极客第一轮;

import java.util.HashMap;
import java.util.HashSet;

public class Leet141 {
    public boolean hasCycle(ListNode head) {
        HashSet hashSet = new HashSet();
        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            }
            hashSet.add(head);
            head = head.next;
        }
        return false;
    }
}
