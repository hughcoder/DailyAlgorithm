package main.链表;


// 需在写一遍
// 输入一个链表，反转链表后，输出新链表的表头。
public class Node1 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        if(head == null){
            return  null;
        }
      ListNode pre = null;
      ListNode next =null;
        System.out.println("head"+head.val);
      while (head != null)
      {
          //相当于 要遍历到最后一位
          // 1->2->3->4->5  ===>  1<-2<-3 4->5
          next = head.next; //首先用一个变量保存当前节点 ,防止出现断裂   （保存当前节点1）
       //   System.out.println("head next.val"+next.val);
          head.next=pre;   //将该链表的下一个节点指向当前定义的链表  //head指向pre后，就继续依次反转下一个节点  （1下个节点指向当前定义指针pre为null）
          //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
          pre=head;   //                                        （1->1）
          System.out.println("next:"+pre.val);
          head = next;                                //head = head.next 重新赋值  （2->1） 一个节点循环结束  第二次从head=2开始和第三位数交换位置
      }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next = new ListNode(4);

        ListNode after;
        after = ReverseList(listNode);

        System.out.println(after.val);
        System.out.println(after.next.val);
    }
}
