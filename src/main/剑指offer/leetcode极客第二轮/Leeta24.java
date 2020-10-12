package main.剑指offer.leetcode极客第二轮;

public class Leeta24 {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode p1 = temp.next;
            ListNode p2 = temp.next.next;

            //swap
            temp.next = p2;
            p1.next = p2.next;
            p2.next = p1;

            //移动temp
            temp = p1;//p1目前是末尾了
        }
        return pre.next;
    }
}
