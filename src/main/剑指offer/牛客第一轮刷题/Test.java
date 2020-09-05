package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;

public class Test {
    private ArrayList<Integer> nodeList = new ArrayList<>();

    public static void main(String args[]) {
        System.out.println(5e2);
        System.out.println(-1E-16);

        //后序遍历测试
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(1);
        right.right = new TreeNode(7);
        node.right = right;
        Test test = new Test();
        test.laterOrder(node);
        System.out.println(test.nodeList);
    }

    public int movingCount(int level) {
        int count = 0;
        bfs(level, count);
        System.out.println("----->" + count);
        int a = 5;
        seta(a);
        System.out.println(a);
        return count;
    }

    private void seta(int c) {
        //传递形参，只是对象的拷贝 对原来数据不做影响
        c = 10;
    }

    private void bfs(int level, int count) {
        if (level == 5) {
            return;
        }
        count++;
//        System.out.println("--->" + count);

        bfs(level + 1, count);
    }


    private void laterOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        laterOrder(node.left);
        laterOrder(node.right);
        nodeList.add(node.val);
    }


}
