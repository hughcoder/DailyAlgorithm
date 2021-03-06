package main.剑指offer.牛客第一轮错题Re;

public class JZ15 {
    //输入一个链表，反转链表后，输出新链表的表头
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
