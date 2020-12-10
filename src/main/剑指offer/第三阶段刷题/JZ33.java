package main.剑指offer.第三阶段刷题;

public class JZ33 {
    //剑指 Offer 33. 二叉搜索树的后序遍历序列
    //[1,3,2,6,5]
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length-1);
    }

    public boolean recur(int[] postor, int i, int j) {
        if(i>=j){
            return true;
        }
        int m=i;
        while (postor[m]<postor[j]){
            m++;
        }
        int z =m;
        while(postor[z] > postor[j]) z++;
        return z == j && recur(postor,i,m-1) && recur(postor,m,j-1);
    }


}

