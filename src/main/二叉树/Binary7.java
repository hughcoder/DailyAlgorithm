package main.二叉树;

import java.util.ArrayList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
//思路 ： 按照特定顺序打印，所以首相要想到的应用数据结构队列
// 首先考虑 该用什么来存放数据
//1.节点- 左- 右，我们以此往某个数据结构中存值，例如存：2，3，4 根：2，左：3，右：4
//2.那我们从这个数据存储中也要以2,3,4来取，先进先出， 就可以用队列的概念，也可以用arrayList每次移除最前面一位
//3.按相应的顺序寸值  在按相应的顺序取值
public class Binary7 {

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {


        // 取
        ArrayList<Integer> valueLists = new ArrayList<Integer>();
        //存
        ArrayList<TreeNode> roots = new ArrayList<TreeNode>();

        if(root == null){
            return valueLists;
        }

        roots.add(root); // 将头节点加进来 遍历

        while (roots.size() != 0) {
            TreeNode gen = roots.remove(0);//先进先出
            if (gen.left != null) {
                roots.add(gen.left);
            }
            if (gen.right != null) {
                roots.add(gen.right);
            }
            valueLists.add(gen.val); // 一次遍历去一次值
        }
        return valueLists;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode2.left = new TreeNode(7);
        treeNode2.right = new TreeNode(8);
        treeNode.left = treeNode2;
        treeNode.right = new TreeNode(4);

        ArrayList<Integer> print = PrintFromTopToBottom(treeNode);
        for (int i = 0; i < print.size(); i++) {
            System.out.println(print.get(i));
        }
    }
}
