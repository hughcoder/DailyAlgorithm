package main.剑指offer第一轮错题;


import java.util.HashMap;

public class JZ25 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }


    public RandomListNode Clone(RandomListNode pHead) {
        HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<>();

        RandomListNode cur = pHead;
        while (cur != null) {
            hashMap.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        RandomListNode cur2 = pHead;
        while (cur2 != null) {
            hashMap.get(cur2).next = hashMap.get(cur2.next);
            hashMap.get(cur2).random = hashMap.get(cur2.random);
            cur2 = cur2.next;
        }
        return hashMap.get(pHead);
    }
}
