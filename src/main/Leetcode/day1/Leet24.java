package main.Leetcode.day1;

//24. 两两交换链表中的节点

//递归和非递归 其中我们应该关心的主要有三点：
// 递归真的简单
//返回值
//调用单元做了什么
//终止条件

//返回值：交换完成的子链表
//        调用单元：设需要交换的两个点为 head 和 next，head 连接后面交换完成的子链表，next 连接 head，完成交换
//        终止条件：head 为空指针或者 next 为空指针，也就是当前无节点或者只有一个节点，无法进行交换


public class Leet24 {

    private static int count = 1;

    public static ListNode swapPairs(ListNode head) {
      //递归先写终止条件
        if(head == null || head.next ==null){
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next = swapPairs(secondNode.next);//对后面的进行递归
        secondNode.next = firstNode;

        return secondNode;

    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);


        ListNode after;
        after = swapPairs(listNode);
        System.out.println(after.val);
        System.out.println(after.next.val);
        System.out.println(after.next.next.val);
        System.out.println(after.next.next.next.val);
    }
}
