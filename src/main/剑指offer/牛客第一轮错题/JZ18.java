package main.剑指offer.牛客第一轮错题;

public class JZ18 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);

    }


    public static void main(String args[]) {
        JZ18 jz18 = new JZ18();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        TreeNode left1 = new TreeNode(4);

        jz18.Mirror(root);
        System.out.println(root.left.val);

    }
}
