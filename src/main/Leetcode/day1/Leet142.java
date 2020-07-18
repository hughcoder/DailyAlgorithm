package main.Leetcode.day1;

//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//
//为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。
//
//说明：不允许修改给定的链表。

public class Leet142 {

    public static ListNode detectCycle(ListNode head) {

        ListNode low = head;
        ListNode fast = head;

        ListNode temp = head;
        boolean hasCycle = false;

        while (low != null && fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;

            if (low == fast) {
                hasCycle = true;
                break;
            }
        }
        // 步骤二：若有环，找到入环开始的节点
        //判断条件 规律： 相遇点到入环点和开始入环的距离相等

        if (hasCycle) {

            ListNode q = head;
            while (low != q) {
                low = low.next;
                q = q.next;
            }

            return q;
        } else {
            return null;
        }

    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);


        ListNode after;
        after = detectCycle(listNode);

    }
}
