package main.剑指offer第一轮刷题;

    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。 BFS
public class JZ22 {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node!=null){
                arrayList.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }

                if(root.right!=null){
                    queue.add(node.right);
                }
            }
        }

        return arrayList;

    }

    public static void main(String args[]) {
         TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        TreeNode noder = new TreeNode(4);
        noder.left = new TreeNode(3);
        noder.right = new TreeNode(6);
        treeNode.right = noder;
        ArrayList<Integer> arrayList =PrintFromTopToBottom(treeNode);

        for (int x : arrayList) {
            System.out.println("x----->" + x);
        }
    }
}
