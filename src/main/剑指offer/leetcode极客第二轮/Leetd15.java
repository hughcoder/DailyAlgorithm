package main.剑指offer.leetcode极客第二轮;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
//请你找出所有满足条件且不重复的三元组。
//注意：答案中不可以包含重复的三元组。

public class Leetd15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> allList = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < nums.length-2; k++) {
            int i = k + 1;
            int j = nums.length - 1;
            if(k > 0 && nums[k] == nums[k - 1]) continue;//这里注意要判重nums[k] == nums[k - 1]
            while (i < j) {
                int sum = nums[i] + nums[k] + nums[j];
                if (sum == 0) {
                    list.clear();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    allList.add(new ArrayList<>(list));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else {
                    while (i < j && nums[i] == nums[++i]) ;
                }
            }
        }
        return allList;
    }

    public static void main(String args[]) {
        Leetd15 leetd15 = new Leetd15();
        int[] a = {-1, 0, 1, 2, -1, -4};
        System.out.println(leetd15.threeSum(a));
    }
}
