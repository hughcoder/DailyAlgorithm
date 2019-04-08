package main.二叉树;

import java.util.ArrayList;
import java.util.Stack;


//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
// 一看题目先区分考察 深度遍历还是广度遍历 然后去想相应的方法套用
// 广度优先遍历，顾名思义，就是横向先遍历，也就是按层次遍历，从根节点往下，对每一层依此访问，
// 在每一层中从左到右（也可以从右到左）遍历，遍历完一层就进入下一层，直到没有节点。

/**
 * 需要在看一遍
 */
public class Binary6 {


    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
         ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        int layer = 1; //层级 奇数从左到右，偶数从右到左
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(pRoot); // 首先将整个二叉树放入一个栈中
        while (!s1.isEmpty() || !s2.isEmpty()) { // 如果两个都为空 则遍历成功
            if (layer % 2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                // 奇数遍历
                while (!s1.isEmpty()) {
                    TreeNode node = s1.pop();
                    if (node != null) {
                        temp.add(node.val);  //list存放每一次的节点
                        System.out.print(node.val + " ");
                        s2.push(node.left); // 这边先放左 （先放后出）
                        s2.push(node.right); // 将后面两个节点传进去后
                    }
                }
                if (!temp.isEmpty()) {  // 防止node为null 传个null进去
                    all.add(temp);
                    layer++;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                // 奇数遍历
                while (!s2.isEmpty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {
                        temp.add(node.val);  //list存放每一次的节点
                        System.out.print(node.val + " ");
                        s1.push(node.right); // 这边先放左 （先放后出）
                        s1.push(node.left); // 将后面两个节点传进去后
                    }
                }
                if (!temp.isEmpty()) {  // 防止node为null 传个null进去
                    all.add(temp);
                    layer++;
                }
            }
        }
        return all;
    }


    public static void main(String args[]) {
        System.out.println("zzzzz");
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode2.left = new TreeNode(7);
        treeNode2.right = new TreeNode(8);
        treeNode.left = treeNode2;
        treeNode.right = new TreeNode(4);

        ArrayList<ArrayList<Integer>> print = Print(treeNode);
        System.out.println("------------"+print.size());
        for (int i = 0; i < print.size(); i++) {
         //   System.out.println(print.get(i));
        }
    }
}
