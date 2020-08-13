package main.剑指offer第一轮刷题;

import java.util.ArrayList;

//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
//滑动窗口
public class JZ42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> singList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    if (!singList.isEmpty()) {
                        int current = array[i] * array[j];
                        int origin1 = singList.get(0);
                        int origin2 = singList.get(1);
                        if (current < origin1 * origin2) {
                            singList.clear();
                            singList.add(array[i]);
                            singList.add(array[j]);
                            break;
                        }
                    } else {
                        singList.add(array[i]);
                        singList.add(array[j]);
                    }
                } else if (array[i] + array[j] > sum) {
                    break;
                }
            }
        }
        return singList;

    }

    public static void main(String args[]) {
        JZ42 jz42= new JZ42();
        int[] array = {1,2,4,7,11,15};
        ArrayList<Integer> lists = jz42.FindNumbersWithSum(array,15);
        System.out.println(lists.toString());
    }
}
