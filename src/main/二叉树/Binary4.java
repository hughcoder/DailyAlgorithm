package main.二叉树;

//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
//前序遍历： 根左右  根节点肯定是前序遍历的第一个数
//中序遍历： 中序遍历就是先访问树的左子节点，再访问树的根节点，再访问右子节点

//思考：首先我们知道中序 遍历是左中右，先根据作图来直观表现下  然后我们进行分类
//分类标准 根据是否有右子树来判断 （为啥用这个来判断，因为要考虑下一个节点，并且根左右的顺序）
//1.首先考虑有右子数的情况  //以根部的点为例，如果有右子数，很明显需要找到最左边的点
//2.接下来考虑没有右子数的情况


public class Binary4 {
    public static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null)
            return pNode;
        if(pNode.right != null){
            //1.首先考虑有右子数的情况
            pNode = pNode.right;
            while(pNode.left!=null) pNode = pNode.left;
            return pNode;
        }else{
          //2.接下来考虑没有右子树的情况
           //分类 1、左子点  2、右子点

            while(pNode.next!=null){ //没右子树，则找第一个当前节点是父节点左孩子的节点
                if(pNode.next.left==pNode) return pNode.next;
                pNode = pNode.next;
            }
        }
        return null;
    }
    public static void main(String args[]) {

    }

}
