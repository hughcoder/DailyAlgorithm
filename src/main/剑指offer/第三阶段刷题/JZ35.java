package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //解题思路
    //1.如果为null 返回null
    //2.初始化hash表，建立原节点和新节点的映射（遍历 1）
    //3.遍历取出新节点，建立random、next的映射 (遍历2)
    // 返回列表对应的头节点
    public Node copyRandomList(Node head) {
        if(head == null){
            return  null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur !=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
