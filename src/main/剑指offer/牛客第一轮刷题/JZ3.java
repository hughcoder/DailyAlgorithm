package main.剑指offer.牛客第一轮刷题;


import java.util.ArrayList;

//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
public class JZ3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList<>();
        if (listNode == null) {
            return array;
        }

        while (listNode != null) {
            array.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = array.size() - 1; i >= 0; i--) {
            array2.add(array.get(i));
        }

        return array2;
    }

    public static void main(String args[]) {
        ListNode node =new ListNode(1);
        node.next = new ListNode(2);
        System.out.println(printListFromTailToHead(node));
    }
}
