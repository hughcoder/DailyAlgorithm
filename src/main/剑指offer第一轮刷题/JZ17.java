package main.剑指offer第一轮刷题;

import java.util.ArrayList;

public class JZ17 {

    public boolean HasSubtree(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recursion(A, B) || HasSubtree(A.left, B) || HasSubtree(A.right, B));

    }

    private boolean recursion(TreeNode root1, TreeNode sub) {
        if (sub == null) {
            return true;
        }
        if (root1 == null || root1.val != sub.val) {
            return false;
        }
        return recursion(root1.left, sub.left) && recursion(root1.right, sub.right);
    }





}
