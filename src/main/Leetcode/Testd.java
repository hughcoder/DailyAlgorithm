package main.Leetcode;


import java.util.ArrayList;


public class Testd {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static class People {
        public String name;
        public Pet pet;

        public People(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Pet{
        String petName;


        public Pet(String petName){
            this.petName = petName;
        }

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            this.petName = petName;
        }
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        //为什么不对原来的值进行改变呢
//        ListNode pos = listNode;
//        pos = pos.next;
//        System.out.println("head----" + listNode.val);
//        System.out.println("pos----" + pos.val);
//        System.out.println("head----" + listNode.val);
//
//
//        People xiaoming =new People("xiaoming");
//        xiaoming.pet = new Pet("dog");
//        People xiaohong = xiaoming;
//        System.out.println("dddd------>"+xiaoming.name);
//        People haha = new People("haha");
//        haha.setName("didi");
//        xiaohong = haha;
//        haha.setName("ggggg");
////        xiaohong.pet = new Pet("fish");
////        xiaohong.pet = new Pet("cat");
////        xiaohong.setName("xiaohong");
//        System.out.println("xiaoming------>"+xiaoming.name);
//        System.out.println("xiaohong------>"+xiaohong.name);
//        System.out.println("xiaoming------>"+xiaoming.pet.petName);
////        System.out.println("xiaohong------>"+xiaohong.pet.petName);
//
//        System.out.println(2/2);

//        char c = 'd';
//        System.out.println(c);
//        System.out.println(c - 'a');
//        System.out.println( 6 >> 1);
//        System.out.println( 5 >> 1);
//        System.out.println( 4 >> 1);
//        System.out.println( 3 >> 1);
//        System.out.println( 2 >> 1);
//        System.out.println( 1 >> 1);

        char[][] a = {{'1'},{'0'},{'1'}};
        char[][] b ={{'1','0','1'}};

        System.out.println(a.length);
        System.out.println(b.length);
    }
}
