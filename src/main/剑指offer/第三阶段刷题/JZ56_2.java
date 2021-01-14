package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ56_2 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }

        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == 1) {
                target = nums[i];
                break;
            }
        }
        return target;
    }
}
