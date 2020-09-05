package main.剑指offer第一轮错题Re;

public class JZ17 {
    //递归
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        return dfs(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2); // 每一个节点都要做递归判断
    }

    private boolean dfs(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return dfs(root1.left, root2.left) && dfs(root1.right, root2.right);
        }
        return false;
    }

    public static void main(String args[]) {
        JZ17 jz17 = new JZ17();
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(4);
        root.left = left1;
        TreeNode left2 = new TreeNode(4);
        left1.left = left2;
        left2.left = new TreeNode(1);
        root.right = new TreeNode(5);

        TreeNode sub = new TreeNode(4);
        sub.left = new TreeNode(1);
        System.out.println(jz17.HasSubtree(root, sub));


    }
}
