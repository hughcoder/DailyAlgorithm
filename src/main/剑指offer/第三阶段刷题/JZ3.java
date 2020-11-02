package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ3 {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                return nums[i];

            }
        }
        return -1;
    }
}
