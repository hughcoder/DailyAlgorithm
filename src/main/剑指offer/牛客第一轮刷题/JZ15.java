package main.剑指offer.牛客第一轮刷题;

import java.util.Stack;

public class JZ15 {

    //输入一个链表，反转链表后，输出新链表的表头。
    public static ListNode ReverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode node = new ListNode(0);
        ListNode pos = node;

        while (!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
        }
        node.next = null;

        return pos.next;

    }



    public static ListNode ReverseList2(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode pre =null;

        while (head != null) {
            ListNode tempNode = head.next;
            head.next = pre;
            pre = head;
            head = tempNode;
        }
        return pre;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
        ListNode node = ReverseList2(listNode);

        System.out.println(node.val);

    }
}
