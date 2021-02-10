package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.List;

public class JZ62 {
    //0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。
    // 求出这个圆圈里剩下的最后一个数字。
    //例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，
    // 因此最后剩下的数字是3。

    //输入: n = 5, m = 3
    //输出: 3
    //输入: n = 10, m = 17
    //输出: 2
    //解题关键 每次完成一圈必须要和大小做判断
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(i);
        }

        int curIndex =0 ;
        while (n>1){
            curIndex = (curIndex+m-1)%n;
            list.remove(curIndex);
            n--;
        }
        return list.get(0);

    }

    public static void main(String args[]) {
        JZ62 jz62 = new JZ62();
        System.out.println(jz62.lastRemaining(5,3));
        System.out.println(jz62.lastRemaining(10,17));
    }
}
