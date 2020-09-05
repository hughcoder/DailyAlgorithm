package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;

public class JZ24 {
    static ArrayList<Integer> path = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
    //递归 四要素
    //1.递归终止条件
    //2.当前层级逻辑处理
    //3.下一层层级调用
    //4.根据需要下探之后对本层所做的影响的还原

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        recursion(root, target);
        return pathList;
    }

    public static void recursion(TreeNode root, int target) {
        if (root == null)
            return;
        target = target - root.val;
        path.add(root.val);
        if(target == 0 && root.left ==null && root.right==null){
            pathList.add(new ArrayList<>(path));
        }
        recursion(root.left,target);
        recursion(root.right,target);
        path.remove(path.size()-1);
    }


    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);
        TreeNode right = new TreeNode(12);
        treeNode.left = left;
        treeNode.right = right;
        ArrayList<ArrayList<Integer>> arrayList = FindPath(treeNode, 22);

        for (ArrayList<Integer> x : arrayList) {
            System.out.println("x----->" + x.toString());
        }
    }
}
