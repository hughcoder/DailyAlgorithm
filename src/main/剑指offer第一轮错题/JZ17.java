package main.剑指offer第一轮错题;

public class JZ17 {
    //输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
//https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/solution/mian-shi-ti-26-shu-de-zi-jie-gou-xian-xu-bian-li-p/
    boolean isDone = false;

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        BFS(root1, root2);
        return isDone;
    }

    private void BFS(TreeNode root1, TreeNode roo2) {
        if (roo2 == null) {
            //结束了
            isDone = true;
            return;
        }

        if (root1 == null) {
            isDone = false;
            return;
        }

        if (root1.val == roo2.val) {
            BFS(root1.left, roo2.left);
            BFS(root1.right, roo2.right);
        } else {
            BFS(root1.left, roo2);
            BFS(root1.right, roo2);
        }
    }
}
