package main.剑指offer第一轮错题;

import java.util.ArrayList;

public class JZ24 {

    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    ArrayList<Integer> singleList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        recur(root,target);
        return allList;
    }

    private void recur(TreeNode root, int target) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            singleList.add(root.val);
            if (isFit(singleList, target)) {
                allList.add(new ArrayList<>(singleList));
            }
            singleList.remove(singleList.size() - 1);
            return;
        }
        singleList.add(root.val);
        recur(root.left, target);
        recur(root.right, target);
        singleList.remove(singleList.size() - 1);
    }

    private boolean isFit(ArrayList<Integer> list, int target) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        return sum == target;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);
        TreeNode right = new TreeNode(12);
        treeNode.left = left;
        treeNode.right = right;
        JZ24 jz24 = new JZ24();
        ArrayList<ArrayList<Integer>> arrayList = jz24.FindPath(treeNode, 22);

        for (ArrayList<Integer> x : arrayList) {
            System.out.println("x----->" + x.toString());
        }
    }
}
