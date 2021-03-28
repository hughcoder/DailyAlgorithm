package main.做题专用;

import java.util.ArrayList;
import java.util.Stack;

//给出两个非空的单向链表来表示两个非负的整数。其中它们各自的位数是按照逆序的方式存储的，
// 并且它们的每个节点只能存储一位数字 如果，我们将两个数相加，则会返回一个新的链表来表示它们的和
// 这两个数都不会以0开头 示例： 输入：（2->4->3）+ (5->6->1) 输出： 7->0->5 原因：342+165=507
public class Test {
    //输入：（2->4->3）+ (5->6->1) 输出： 7->0->5 原因：342+165=507

    public int getListNode2(ListNode l1, ListNode l2) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isTen = false;//记录是否要进制
        Stack<Integer> stack = new Stack<>();
        while (l1 != null) {
            int curL1 = l1.val;
            int curl2 = l2.val;
            System.out.println("cur1---->"+curL1+"---curl2--->"+curl2);
            int curNum = 0;
            if (isTen) {
                if (curL1 + curl2 + 1 >= 10) {
                    isTen = true;
                    curNum = curL1 + curl2 + 1 - 10;
                } else {
                    isTen = false;
                    curNum = curL1 + curl2+1;
                }
            } else {
                if (curL1 + curl2 >= 10) {
                    isTen = true;
                    curNum = curL1 + curl2  - 10;
                } else {
                    isTen = false;
                    curNum = curL1 + curl2;
                }
            }

//            stringBuilder.append(curNum);
            stack.push(curNum);
            l1 = l1.next;
            l2 = l2.next;
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder1.append(stack.pop());
        }
        return Integer.parseInt(stringBuilder1.toString());
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        node1.next = node2;
        node2.next = new ListNode(3);


        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(6);
        a1.next = a2;
        a2.next = new ListNode(1);
        Test test = new Test();
        System.out.println(test.getListNode2(node1, a1));
    }
}
