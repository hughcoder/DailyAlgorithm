package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ56 {
    //一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。
// 要求时间复杂度是O(n)，空间复杂度是O(1)。
    public int[] singleNumbers(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }

        int[] target = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == 1) {
                target[index] = nums[i];
                index++;
            }
        }
        return target;
    }
}
