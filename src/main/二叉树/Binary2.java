package main.二叉树;

//操作给定的二叉树，将其变换为源二叉树的镜像。
//首先思路：二叉树考的是递归 所以关键对于每一个节点的处理 题目不难 重点是要找到规律 每次将子树调换位置就行了
public class Binary2 {

    public static void Mirror(Binary1.TreeNode root) {  //考虑3种情况
        if(root == null){   //1 如果根节点为null
            return;
        }
        if(root.left == null && root.right ==null){  //2 如果根的左右节点为null
            return;
        }
        //3
        Binary1.TreeNode treeNode; //将每个根节点的左右位置对换
        treeNode = root.right;
        root.right = root.left;
        root.left = treeNode;

        if(root.left !=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }

    }


    public static void main(String args[]){

    }
}
