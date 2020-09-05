package main.剑指offer.牛客第一轮错题Re;

public class JZ16 {
    //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode(0);
        ListNode node = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            node = node.next;
        }
        node.next = list1 == null ? list2 : list1;
        return head.next;
    }

    public static void main(String args[]) {
        JZ16 jz16 = new JZ16();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        ListNode node = jz16.Merge(listNode, listNode2);

    }
}
