package main.栈相关和队列;


import java.util.ArrayList;

//给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3
// ，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
// {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
// {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。

//
public class Stack2 {

    public static ArrayList<Integer> maxInWindows(int[] num, int size) {



        ArrayList<Integer> tempList = new ArrayList<Integer>();

        if(size == 0){
            return tempList;
        }
        int maxNum = 0;
        int index = 0;
        for (int i = 0; i < num.length ; i++) {
            int a = num[i];
            int initlenth = i + size -1;
            if (initlenth< num.length) {
                maxNum = a;
                for (int j = i; j < i+size; j++) {
                    if (num[j] > maxNum) {
                        maxNum = num[j];
                    }
                }
                tempList.add(maxNum);

            }
        }
        return tempList;
    }

    public static void main(String args[]) {
        //4,4,6,6,6,5
        int[] testNum = new int[]{2, 3, 4, 2, 6, 2, 5, 1};

        int[] test22 = new int[]{10,14,12,11};
        ArrayList<Integer> testList = maxInWindows(test22, 1);


        for (int i = 0; i < testList.size(); i++) {
            System.out.println("---->" + testList.get(i));
        }
    }
}
