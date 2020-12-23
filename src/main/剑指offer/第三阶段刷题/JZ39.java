package main.剑指offer.第三阶段刷题;

import java.util.Arrays;

public class JZ39 {
    //数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int target = nums.length/2;
        return nums[target];
    }
}
