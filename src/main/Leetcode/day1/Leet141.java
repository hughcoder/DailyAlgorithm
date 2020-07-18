package main.Leetcode.day1;

//141. 环形链表

//解题思路 :1.set  判重 o(n)
//2.快慢指针 快与慢相遇（结果）o(n)
// 如果有环的话 肯定不会为null 了 快慢指针到最后
public class Leet141 {
    public static boolean hasCycle(ListNode head) {

//        if(head==null){
//            return false;
//        }

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);


//        ListNode after;
//        after = hasCycle(listNode);
//        System.out.println(after.val);
//        System.out.println(after.next.val);
    }
}
