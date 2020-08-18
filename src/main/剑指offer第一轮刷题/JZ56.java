package main.剑指offer第一轮刷题;

import java.util.ArrayList;
import java.util.HashSet;

public class JZ56 {

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead) {

        ArrayList<ListNode> out = new ArrayList<>();
        ArrayList<ListNode> duplicate = new ArrayList<>();

        while (pHead != null) {
            if (!isContains(duplicate, pHead.val)) {
                if (isContains(out, pHead.val)) {
                    for (int i = 0; i < out.size(); i++) {
                        if (out.get(i).val == pHead.val) {
                            out.remove(i);
                        }
                    }
                    duplicate.add(pHead);
                } else {
                    out.add(pHead);
                }
            }
            pHead = pHead.next;
        }

        ListNode node = new ListNode(0);
        ListNode outputNode = node;

        for (int i = 0; i < out.size(); i++) {
            node.next = new ListNode(out.get(i).val);
            node = node.next;
        }

        return outputNode.next;

    }

    private boolean isContains(ArrayList<ListNode> arrayList, int val) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).val == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        JZ56 jz56 = new JZ56();
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode outnode =   jz56.deleteDuplication(node);
    }
}
