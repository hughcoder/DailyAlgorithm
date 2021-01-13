package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ54 {
    //左根右  从小到大
    ArrayList<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        inOrder(root);
        ;
        int realIndex = list.size()  - k;
        return list.get(realIndex);
    }

    public void inOrder(TreeNode root){

        if(root == null){
            return;
        }

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }


}
