package main.剑指offer第一轮刷题;

import java.util.HashMap;

//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
public class JZ40 {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int findCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(array[i]) == null) {
                hashMap.put(array[i], 1);
            } else {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(array[i]) == 1) {
                if (findCount == 0) {
                    findCount++;
                    num1[0] = array[i];
                } else {
                    num2[0] = array[i];
                    break;
                }
            }
        }
    }
}
