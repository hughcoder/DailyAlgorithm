package main.剑指offer第一轮错题;

import java.util.ArrayList;
import java.util.Collections;

public class JZ16 {
    //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode head = node;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            } else {
                node.next = list2;
                node = node.next;
                list2 = list2.next;
            }
        }
        node.next = list1 != null ? list1 : list2;
        return head.next;
    }

    public ListNode MergebyArraylist(ListNode list1, ListNode list2) {

        ListNode node = new ListNode(0);
        ListNode head = node;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (list1 != null) {
            arrayList.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            arrayList.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(arrayList);

        for (int x : arrayList) {
            node.next = new ListNode(x);
            node = node.next;
        }
        return head.next;

    }
}
