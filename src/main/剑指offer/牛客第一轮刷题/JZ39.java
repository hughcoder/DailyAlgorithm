package main.剑指offer.牛客第一轮刷题;

public class JZ39 {
    //输入一棵二叉树，判断该二叉树是否是平衡二叉树。
    //如果某二叉树中任意节点的左右子树的深度相差不超过1，
    //最优解 先序遍历 + 剪枝
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    private int dfs(TreeNode root){
        if(root == null){ //当越过叶子节点时，返回高度 0 ；
            return 0;
        }
        int left = dfs(root.left);
        if(left == -1){
            return -1;
        }
        int right = dfs(root.right);
        if(right == -1){
            return -1;
        }
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;//当左（右）子树高度 left== -1 时，代表此子树的 左（右）子树 不是平衡树，因此直接返回 -1−1 ；

    }



    public static void main(String args[]) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(1);
        right.right = new TreeNode(7);
        node.right = right;
        JZ39 jz39 = new JZ39();
        jz39.isBalanced(node);
    }
}
