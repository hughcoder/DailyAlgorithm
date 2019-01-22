package main.二叉树;


//请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
//前序遍历： 根左右  根节点肯定是前序遍历的第一个数
//中序遍历： 中序遍历就是先访问树的左子节点，再访问树的根节点，再访问右子节点

//思路 我们遍历二叉树从根向下，所以保持根一致，然后确保左右值一样
//由于前序遍历 为前左右
//我们定义对称前序遍历 为前右左

//如果左右与右左保持一致，则对称
public class Binary5 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    boolean isSymmetrical(TreeNode pRoot) {
      return  isSame(pRoot,pRoot);
    }

   private boolean isSame(TreeNode pRoot,TreeNode pRoot2){
        if(pRoot ==null && pRoot2==null) //当遍历到最后 则都为ture
            return true;
        if(pRoot ==null || pRoot2==null) //这边主要是遇到 类似相同数字的二叉树，例 7777777null,777777null7
            return false;
        if(pRoot.val != pRoot2.val){
            return false;   //每一次递归进来都要对值进行判断 只判断上面两个条件还是不够的
        }
        return isSame(pRoot.left,pRoot2.right)&&isSame(pRoot.right,pRoot2.left); //左边前序遍历，右边对称前序遍历 递归思想
    }

    public static void main(String arg[]) {

    }
}
