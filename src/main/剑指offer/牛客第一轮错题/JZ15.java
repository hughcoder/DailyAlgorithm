package main.剑指offer.牛客第一轮错题;

import java.util.Stack;

public class JZ15 {
    public ListNode ReverseListStack(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode node = new ListNode(stack.pop());
        ListNode output = node;
        while (!stack.empty()) {
            node.next = new ListNode(stack.pop());
            node = node.next;
        }
        return output;
    }

    // 1->2->3 要把一个个分出去 然后重新指向
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;//每次存放新的构造节点
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head; // pre是新的构造链表
            head = temp;
        }
        return pre;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
        JZ15 jz15 = new JZ15();
        ListNode node = jz15.ReverseList(listNode);

        System.out.println(node.val);

    }
}
