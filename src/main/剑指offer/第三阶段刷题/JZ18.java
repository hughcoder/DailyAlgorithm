package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ18 {
    public ListNode deleteNode(ListNode head, int val) {
        ArrayList<Integer> list = new ArrayList();

        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        for(int i=0;i<list.size();i++){
            if(val == list.get(i)){
                list.remove(i);
                break;
            }
        }

        ListNode node = new ListNode(list.get(0));
        ListNode newNode = node;
        for(int i=1;i<list.size();i++){
            node.next = new ListNode(list.get(i));
            node = node.next;
        }
        return newNode;
    }
}
