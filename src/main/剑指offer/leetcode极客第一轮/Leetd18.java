package main.剑指offer.leetcode极客第一轮;

//给定一个包含 n 个整数的数组 nums 和一个目标值 target，
// 判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetd18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> singleList = new ArrayList<>();
        List<List<Integer>> allList = new ArrayList<>();
        HashSet<List<Integer>> hashSet = new HashSet<>();

        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums.length; b++) {
                for (int c = 0; c < nums.length; c++) {
                    for (int d = 0; d < nums.length; d++) {
                        if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
                            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                                singleList.clear();
                                singleList.add(nums[a]);
                                singleList.add(nums[b]);
                                singleList.add(nums[c]);
                                singleList.add(nums[d]);
                                if(hashSet.contains(singleList)){
                                    continue;
                                }
                                hashSet.add(singleList);
                                allList.add(new ArrayList<>(singleList));
                            }
                        }
                    }
                }
            }
        }
        return allList;
    }

    public static void main(String args[]) {
        Leetd18 leetd18 = new Leetd18();
        int[] a = {1, 0, -1, 0, -2, 2};
        System.out.println(leetd18.fourSum(a, 0));

    }
}
