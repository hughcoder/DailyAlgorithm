package main.剑指offer第一轮刷题;

import java.util.ArrayList;
import java.util.Arrays;

public class JZ13 {

    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
    // 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public static void reOrderArray(int[] array) {
        //奇数组
        //偶数组
        ArrayList<Integer> unevenList = new ArrayList();
        ArrayList<Integer> evenList = new ArrayList();
        ArrayList<Integer> allList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenList.add(array[i]);
            } else {
                unevenList.add(array[i]);
            }
        }

        allList.addAll(unevenList);
        allList.addAll(evenList);
        for (int i = 0; i < allList.size(); i++) {
            array[i] = allList.get(i);
        }
    }

    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        reOrderArray(a);
        for(int x :a){
            System.out.println("---->"+x);
        }
    }
}
