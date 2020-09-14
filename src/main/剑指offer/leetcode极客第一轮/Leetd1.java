package main.剑指offer.leetcode极客第一轮;

public class Leetd1 {
    public int[] twoSum(int[] nums, int target) {
        int[] aa = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i != j) {
                        aa[0] = i;
                        aa[1] = j;
                    }
                }
            }
        }
        return aa;
    }
}
