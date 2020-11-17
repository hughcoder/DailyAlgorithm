package main.剑指offer.第三阶段刷题;


import java.util.ArrayList;
import java.util.List;

public class JZ6 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] a = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(list.size()-1-i);
        }
        return a;
    }
}
