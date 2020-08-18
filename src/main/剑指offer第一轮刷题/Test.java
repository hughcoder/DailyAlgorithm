package main.剑指offer第一轮刷题;

import main.Leetcode.TreeNode;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        String str = "[1,2,3,null,null,4,5]";
        String newStr = str.substring(1,str.length()-1);
        String arr[] = newStr.split(",");
        System.out.println(arr);
    }

}
