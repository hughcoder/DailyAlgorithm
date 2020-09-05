package main.剑指offer.牛客第一轮错题Re;

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
        //第一次循环存节点和对应新的值(map里就有每个单个节点)
        //第二次循环（因为链表 顺序一致）取出节点新的值对应next和随机（将所有新的点串起来）

        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode head = pHead;

        while (head!=null){
            map.put(head,new RandomListNode(head.label));
            head = head.next;
        }
        RandomListNode cur = pHead;
        while (cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(pHead);
    }
}
