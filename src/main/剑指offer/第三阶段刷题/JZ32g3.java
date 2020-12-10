package main.剑指offer.第三阶段刷题;

import java.util.*;

public class JZ32g3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> groupList = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        queue.add(root);
        int index = 0;
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            list.clear();
            index++;//从第一行开始
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    if (index % 2 == 0) {
                        stack.add(cur.val);
                    } else {
                        list.add(cur.val);
                    }
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
            if (index % 2 == 0) {
                ArrayList listtemp = new ArrayList();
                while (!stack.isEmpty()){
                    listtemp.add(stack.pop());
                }
                groupList.add(new ArrayList<>(listtemp));
            } else {
                groupList.add(new ArrayList<>(list));
            }

        }


        return groupList;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode2.left = new TreeNode(7);
        treeNode2.right = new TreeNode(8);
        treeNode.left = treeNode2;
        treeNode.right = new TreeNode(4);

        JZ32g3 jz32g3 = new JZ32g3();
        List<List<Integer>> print = jz32g3.levelOrder(treeNode);
        System.out.println("------------" + print.size());
        for (int i = 0; i < print.size(); i++) {
            System.out.println(print.get(i));
        }
    }
}
