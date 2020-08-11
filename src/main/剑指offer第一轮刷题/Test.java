package main.剑指offer第一轮刷题;

import main.Leetcode.TreeNode;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        ArrayList list1 = new ArrayList();
        list1.add(1);

        ArrayList<ArrayList> list2 = new ArrayList();
        list2.add(list1);

        System.out.println(list1.size());
        System.out.println(list2.size());

        StringBuilder builder = new StringBuilder();
        builder.append(111);
        builder.append(222);
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder.toString()
        );
    }

}
