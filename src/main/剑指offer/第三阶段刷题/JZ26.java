package main.剑指offer.第三阶段刷题;

public class JZ26 {
    //若树B是树A的子结构
    //1.遍历A的每一个节点
    //2.若B遍历完则说明有，若A遍历完，B还没说明没有
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A != null && B != null) {
            return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);//第一个节点遍历
        } else {
            return false;
        }
    }

    public boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            //说明遍历完了
            return true;
        }

        if (A == null || A.val != B.val) {
            return false; // 1.A遍历完 B还没， 2.值不相等
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
