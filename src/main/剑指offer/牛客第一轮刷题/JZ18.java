package main.剑指offer.牛客第一轮刷题;

public class JZ18 {
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }

        TreeNode temp  = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);

        Mirror(root.right);
    }
}
