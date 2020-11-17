package main.剑指offer.第三阶段刷题;


public class JZ7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        //先创建根节点
        TreeNode rootNode = new TreeNode(preorder[0]);
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(preorder[0] == inorder[i]){
                rootIndex = i;
                break;
            }
        }
        System.out.println("rootIndex"+rootIndex);
        int[] leftPre = new int[rootIndex + 1];
        int[] rightPre = new int[inorder.length - rootIndex];

        int[] leftIn = new int[rootIndex + 1];
        int[] rightIn = new int[inorder.length - rootIndex];

        for (int i = 0; i < inorder.length; i++) {
            if (i < rootIndex) {
                leftIn[i] = inorder[i];
            } else if (i > rootIndex) {
                rightIn[i - rootIndex - 1] = inorder[i];
            }
        }

        for (int i = 1; i < preorder.length; i++) {
            if (i < rootIndex + 1) {
                leftPre[i - 1] = preorder[i];
            } else {
                rightPre[i - 1] = preorder[i];
            }
        }
        rootNode.left = buildTree(leftPre, leftIn);
        rootNode.right = buildTree(rightPre, rightIn);
        return rootNode;
    }

    public static void main(String args[]) {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};
        JZ7 jz7 = new JZ7();
        TreeNode list = jz7.buildTree(pre, in);
        System.out.println("---->zz" + list.val);

    }
}
