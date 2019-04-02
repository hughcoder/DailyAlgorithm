package main.二叉树;


//输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
// (注意: 在返回值的list中，数组长度大的数组靠前)

import java.util.ArrayList;

public class Binary10 {


    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);
        TreeNode right = new TreeNode(12);
        treeNode.left = left;
        treeNode.right = right;

        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
//        resultList = FindPath(treeNode, 22);
      //  System.out.println(resultList.size());
//        for (int i = 0; i < resultList.size(); i++) {
//            ArrayList<Integer> aa = new ArrayList<>();
//            aa = resultList.get(i);
//            System.out.println("cccc"+aa.size());
//            for (int j = 0; j < aa.size(); j++) {
//                System.out.println("-----------------" + aa.get(j));
//            }
//        }
    }

}
