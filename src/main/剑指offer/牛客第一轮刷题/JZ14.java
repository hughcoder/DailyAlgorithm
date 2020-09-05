package main.剑指offer.牛客第一轮刷题;

//输入一个链表，输出该链表中倒数第k个结点。
public class JZ14 {
    public static ListNode FindKthToTail(ListNode head, int k) {
        ListNode slownode = head;
        ListNode quicknode = head;

        int count = 0;
        while (quicknode != null) {
            count++;
            if (count > k) {
                slownode = slownode.next;
            }
            quicknode = quicknode.next;
        }

        if(count<k){
            return null;
        }
        return slownode;

    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode node = FindKthToTail(listNode, 1);
    }
}
