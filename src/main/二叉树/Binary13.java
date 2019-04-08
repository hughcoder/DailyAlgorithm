package main.二叉树;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
public class Binary13 {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        if(pRoot == null){
            return all;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int thisline = 1;
        int nextline= 0;
        ArrayList<Integer> temp = new ArrayList<>();

        while (!queue.isEmpty()){
            TreeNode node = ((LinkedList<TreeNode>) queue).pop();
            if(node!=null){
                temp.add(node.val);
                thisline --;
            }
            if(node.left!=null){
                ((LinkedList<TreeNode>) queue).add(node.left);
                nextline++;
            }
            if(node.right!=null){
                ((LinkedList<TreeNode>) queue).add(node.right);
                nextline++;
            }
            if(thisline == 0){
                all.add(temp);
                thisline = nextline;
                nextline =0 ;
                temp = new ArrayList<>();
            }
        }
        return  all;

    }

    public static void main(String args[]) {
        System.out.println("zzzzz");
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode2.left = new TreeNode(7);
        treeNode2.right = new TreeNode(8);
        treeNode.left = treeNode2;
        treeNode.right = new TreeNode(4);

        ArrayList<ArrayList<Integer>> print = Print(treeNode);
        System.out.println("------------" + print.size());
        for (int i = 0; i < print.size(); i++) {
            System.out.println(print.get(i));
        }
    }

}
