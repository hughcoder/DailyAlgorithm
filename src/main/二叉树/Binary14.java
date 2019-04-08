package main.二叉树;

import java.util.ArrayList;

public class Binary14 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        ArrayList<ArrayList<Integer>> tree1 = getDepth(root1);
        ArrayList<ArrayList<Integer>> tree2 = getDepth(root2);

        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        for(int i =0;i<tree1.size();i++){
          for(int j=0;j<tree1.get(i).size();j++){
              l1.add(tree1.get(i).get(j));
          }
        }
        for(int i =0;i<tree2.size();i++){
            for(int j=0;j<tree2.get(i).size();j++){
                l2.add(tree2.get(i).get(j));
            }
        }

        int index= 0;

        for(index =0;index<l1.size();index++){
          if(l2.get(0) == l1.get(index)){
              index++;
          }
        }

        int mark = 0;

        for(mark =0;mark<l2.size();mark++){
            if(l2.get(mark)==l1.get(index+mark)){
                mark++;
            }
        }
        if(mark == l2.size()){
            return  true;
        }else {
            return false;
        }

    }

    public  ArrayList<ArrayList<Integer>> getDepth(TreeNode root){
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        if(root == null){
            return pathList;
        }

        if(root.left == null&& root.right ==null){
            pathList.add(new ArrayList<>(path));
        }
        if(root.left!=null){
            getDepth(root.left);
        }
        if(root.right!=null){
            getDepth(root.right);
        }
        path.remove(path.size()-1);

        return pathList;
    }
}
