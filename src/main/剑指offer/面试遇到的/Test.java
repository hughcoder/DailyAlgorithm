package main.剑指offer.面试遇到的;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {


    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        ArrayList<Integer> list = new ArrayList();
        ListNode temp = new ListNode(0);
        ListNode newHead = temp;
        while (head != null) {
            if (!list.contains(head.val)) {
                list.add(head.val);
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }

        return newHead.next;
    }

    public static void main(String args[]) {

    }
}
