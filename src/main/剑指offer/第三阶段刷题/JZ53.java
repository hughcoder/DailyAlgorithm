package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ53 {
    //统计一个数字在排序数组中出现的次数。
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }

        if(hashMap.get(target) == null){
            return 0;
        }else {
            return hashMap.get(target);
        }
    }
}
