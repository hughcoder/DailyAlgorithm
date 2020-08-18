package main.剑指offer第一轮刷题;

public class JZ58 {
    public  boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return DFS(pRoot.left, pRoot.right);
    }

    private boolean DFS(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val == right.val) {
            return DFS(left.left, right.right) && DFS(left.right, right.left);
        }else {
            return false;
        }

    }

    public static void main(String args[]) {
        JZ58 jz58 = new JZ58();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        jz58.isSymmetrical(node);
    }
}
