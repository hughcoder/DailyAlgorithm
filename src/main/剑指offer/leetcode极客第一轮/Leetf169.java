package main.剑指offer.leetcode极客第一轮;

import java.util.Arrays;

public class Leetf169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
