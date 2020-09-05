package main.剑指offer.牛客第一轮刷题;

public class JZ36 {
    //输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int l1 = 0;
        int l2 = 0;

        ListNode h1 = pHead1;
        ListNode h2 = pHead2;
        ListNode node;

        while (h1 != null) {
            l1++;
            h1 = h1.next;
        }
        while (h2 != null) {
            l2++;
            h2 = h2.next;
        }

        if (l1 < l2) {
            int num = l2 - l1; //h2比较长
            for (int i = 0; i < num; i++) {
                pHead2 = pHead2.next;
            }
        } else {
            int num = l1 - l2; //h1比较长
            for (int i = 0; i < num; i++) {
                pHead1 = pHead1.next;
            }
        }

        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val == pHead2.val) {
                return pHead1;
            }

            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return null;

    }
}
