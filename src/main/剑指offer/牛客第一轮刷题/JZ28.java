package main.剑指offer.牛客第一轮刷题;

import java.util.HashMap;

public class JZ28 {
    public int MoreThanHalfNum_Solution(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxCount = array.length / 2;
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(array[i]) == null) {
                hashMap.put(array[i], 1);  //这边计数开始要注意
            } else {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int count = hashMap.get(array[i]);
            if (count > maxCount) {
                maxNum = array[i];
            }
        }

        return maxNum;


    }
}
