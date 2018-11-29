package main.二叉树;


// 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

//前序遍历： 根左右  根节点肯定是前序遍历的第一个数
//中序遍历： 中序遍历就是先访问树的左子节点，再访问树的根节点，再访问右子节点
//需要用到递归的思想
public class Binary1 {
     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length!=in.length||pre.length==0||in.length==0)
            return null;  //这一步很重要  当左或者右子树没值的时候需要置空，否则继续走下去会包空指针
         TreeNode treeNode = new TreeNode(pre[0]); // 根据前序遍历的第一个数确定整个二叉树的根节点
        // 1。拿到根节点，能确定中序遍历的左边是左子树，右边的右子树
        int len = pre.length;
        //2。接下来就要去找到中序中的位置
        int index ;
        for(index=0;index<in.length;index++ ){
            if(pre[0] == in[index]){
                break;
            }
        }
        System.out.println("index"+index);
        System.out.println("len"+len);
        // 4,7,2 为左子树，5386为右子树
        // 接下来需要根据前、中来确定子序列

        int[] preLeft = new int[index];
        int[] inLeft = new int[index];
        int[] preRight = new int[len-index-1];
        int[] inRight = new int[len-index-1];
        System.out.println("in.length"+in.length);
        for(int j=0;j<in.length;j++){
            if(j<index){
                //相对于当前根部的左子树
                preLeft[j] = pre[j+1];
                inLeft[j]= in[j];
            }else if(j>index){
                //相对于当前根部的右字树
                System.out.println("j-index"+(j-index));
                System.out.println("------j"+j);
                preRight[j-index-1]=pre[j];
                inRight[j-index-1]=in[j];
            }
        }
        treeNode.left=reConstructBinaryTree(preLeft,inLeft);
        treeNode.right=reConstructBinaryTree(preRight,inRight);
        return treeNode;
    }

    public static void main(String args[]){
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in ={4,7,2,1,5,3,8,6};

         reConstructBinaryTree(pre,in);

    }
}
