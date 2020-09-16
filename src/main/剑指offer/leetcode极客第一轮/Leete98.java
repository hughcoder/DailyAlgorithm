package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;

//98. 验证二叉搜索树
public class Leete98 {
    //左<根<右
    //对任意子子树也满足

    //解题思路1：递归因为中序遍历的顺序是左->根->右 所以直接判断是否是一个生序的结果,这边记录一次上个节点就行了

    TreeNode pre;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

       if(!isValidBST(root.left)){
           return false;
       }
       if(pre!=null){
          if( pre.val>=root.val){
              return false;
          }
       }

       pre=root;

       return isValidBST(root.right);

    }

    //解题思路2：第一种二叉搜索树在列表中是一个生序的结果
//    ArrayList<Integer> list = new ArrayList<>();
//
//    public boolean isValidBST2(TreeNode root) {
//        inOrder(root);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) <= list.get(i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private void inOrder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//
//        inOrder(root.left);
//        list.add(root.val);
//        inOrder(root.right);
//
//    }


}
