package main.剑指offer第一轮刷题;

import main.Leetcode.TreeNode;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            if (list1.get(i) == 1) {
                break;
            }
        }
    }

}
