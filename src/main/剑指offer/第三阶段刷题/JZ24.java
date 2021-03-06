package main.剑指offer.第三阶段刷题;

import java.util.Stack;

public class JZ24 {
    //定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
    //输入: 1->2->3->4->5->NULL
    //输出: 5->4->3->2->1->NULL
    public ListNode reverseList2(ListNode head) {
        if(head == null){
            return null;
        }
       //用栈来实现
        Stack<Integer> stack = new Stack<>();

        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode node = new ListNode(stack.pop());
        ListNode temp = node;
        while (!stack.isEmpty()){
            node.next = new ListNode(stack.pop());
            node = node.next;
        }
        return temp;
    }
}
