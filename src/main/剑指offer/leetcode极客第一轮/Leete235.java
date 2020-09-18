package main.剑指offer.leetcode极客第一轮;

public class Leete235 {
    //从根部开始遍历，如果根节点是p,q的公共节点，必然成立 p.val < 根 <q.val

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        System.out.println("1----->");
        if(root.val>p.val&&root.val>q.val){
            System.out.println("2----->");
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val<p.val&&root.val<q.val){
            System.out.println("3----->");
            return lowestCommonAncestor(root.right,p,q);
        }
        System.out.println("4-val---->"+root.val);
        return root;
    }


    public static void main(String args[]) {
        Leete235 leete235 = new Leete235();
        TreeNode node = new TreeNode(6);
        node.left = new TreeNode(2);
        TreeNode right = new TreeNode(8);
        right.left = new TreeNode(7);
        right.right = new TreeNode(9);
        node.right = right;
        leete235.lowestCommonAncestor(node,new TreeNode(7),new TreeNode(9));
    }

}





