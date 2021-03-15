package main.剑指offer.面经遇到的;

// 链表求和
//https://leetcode-cn.com/problems/sum-lists-lcci/
//这些数位是反向存放的，也就是个位排在链表首部。
public class Testmj4 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode head = pre;
        int carry = 0;
        while (l1 != null || l2 != null || carry!=0) { // 这里还要考虑进位不为0
            //个位相加
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10; //进位
            pre.next = new ListNode(sum % 10);
            pre = pre.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head.next;
    }


}
