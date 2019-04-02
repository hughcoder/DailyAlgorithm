package main.二叉树;

//输入一棵二叉树，求该树的深度。
// 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
// 考察DFS
import java.util.ArrayList;

public class Binary11 {

    static ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
    static ArrayList<Integer> path = new ArrayList<>();

    public static int TreeDepth(TreeNode root) {
     if(root ==null){
         return 0;
     }
     path.add(root.val);

     if(root.left == null && root.right ==null){
         pathList.add(new ArrayList<>(path));
     }

     if(root.left!=null){
        TreeDepth(root.left);
     }

     if(root.right !=null){
         TreeDepth(root.right);
     }
     path.remove(path.size()-1);

     return getNum(pathList);
    }

    public static int getNum(ArrayList<ArrayList<Integer>> pathList){
        ArrayList<Integer> list = new ArrayList<>();

        int max =pathList.get(0).size();
        for(int i =0;i<pathList.size();i++){
          if(pathList.get(i).size() >= max){
              max = pathList.get(i).size();
          }
        }
        return max;
    }

    public static void main(String args[]) {

    }
}
