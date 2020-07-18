package main.Leetcode.day1;

import main.链表.Node1;

import java.util.Stack;

//206. 反转链表
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
public class Leet206 {

    //方法1 :用栈
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        Stack<ListNode> stack = new Stack();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode pos = new ListNode(0);
        head = pos;
        //重新构造
        while (!stack.empty()){
            pos.next = stack.pop();
            pos = pos.next;
        }
        pos.next = null;


        return head.next;
    }

    //方法二 链表交换相邻元素



    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
//        listNode.next.next.next = new ListNode(4);


        ListNode after;
        after = reverseList(listNode);

        System.out.println(after.val);
        System.out.println(after.next.val);
//        System.out.println(after.next.next.val);
//        System.out.println(after.next.next.next.val);
    }

}
