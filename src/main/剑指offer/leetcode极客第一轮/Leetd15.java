package main.剑指offer.leetcode极客第一轮;

//给定一个包含 n 个整数的数组 nums 和一个目标值 target，
// 判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leetd15 {

    public List<List<Integer>> threeSum(int[] nums) {
        //target == 0
        List<Integer> singleList = new ArrayList<>();
        List<List<Integer>> allList = new ArrayList<>();
        //1.排序
        Arrays.sort(nums);
        //2.循环nums
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k+1;
            int j = nums.length - 1;
            if(k > 0 && nums[k] == nums[k - 1]) continue;//这里注意要判重nums[k] == nums[k - 1]
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]);
                } else if (sum < 0) {
                    while(i < j && nums[i] == nums[++i]);
                } else {
                    singleList.clear();
                    singleList.add(nums[k]);
                    singleList.add(nums[i]);
                    singleList.add(nums[j]);
                    allList.add(new ArrayList<>(singleList));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }

        return allList;
    }

    public static void main(String args[]) {
        Leetd15 leetd18 = new Leetd15();
//        int[] a = {1, 0, -1, 0, -2, 2};
//        int[] a = {-1,0,1,2,-1,-4};
        int[] a ={-2,0,0,2,2};
        System.out.println(leetd18.threeSum(a));

    }
}
