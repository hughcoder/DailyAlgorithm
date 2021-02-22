package main.剑指offer.第三阶段刷题;

public class JZ68_1 {
    //后续遍历
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null ) {
            return root;
        }

        if(root == p || root == q){
            return root;
        }

       TreeNode left = lowestCommonAncestor(root.left,p,q);
       TreeNode right = lowestCommonAncestor(root.right,p,q);

        return left == null ? right : right == null ? left : root;

    }

    public static void main(String args[]) {
        JZ68_1 jz61 = new JZ68_1();

    }
}
