package main.剑指offer第一轮刷题;

import java.util.HashSet;

public class JZ55 {
    //给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。

    //解法一 用HashSet Set第一个节点算
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet();

        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }

        return null;
    }
}
