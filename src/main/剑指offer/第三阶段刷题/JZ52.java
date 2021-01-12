package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ52 {
    //输入两个链表，找出它们的第一个公共节点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> hashMap = new HashMap<>();
        while (headA!=null){
            hashMap.put(headA,1);
            headA = headA.next;
        }

        while (headB!=null){
            if(hashMap.get(headB)!=null){
                return headB;
            }
            headB = headB.next;
        }

        return null;

    }
}
