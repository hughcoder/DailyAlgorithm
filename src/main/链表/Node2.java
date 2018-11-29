package main.链表;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Node2 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 ==null){
            return list2;
        }
        if(list2 == null){
            return list2;
        }

        if(list1.val<list2.val){
            list1=Merge(list1.next,list2);
            return list1;
        }else {
            list2 = Merge(list1,list2.next);
            return list2;
        }
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next = new ListNode(4);


        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next = new ListNode(4);

        Merge(listNode,list2);
    }
}
