package main.剑指offer.leetcode极客第一轮;

public class Leet24 {

    public ListNode swapPairs(ListNode head) {
        //非递归
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next!=null) {
            //temp没轮都在移动
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next =start;
        }
        return temp.next;
    }
}
