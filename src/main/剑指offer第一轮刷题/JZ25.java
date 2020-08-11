package main.剑指offer第一轮刷题;

import java.util.HashMap;

public class JZ25 {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead) {

        HashMap<RandomListNode,RandomListNode> hashMap = new HashMap<>();

        RandomListNode cur = pHead;
        while (cur!=null){
            hashMap.put(cur,new RandomListNode(cur.label));
            cur = cur.next;
        }

        cur = pHead;
        while (cur!=null){
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }

        return hashMap.get(pHead);

    }
}
