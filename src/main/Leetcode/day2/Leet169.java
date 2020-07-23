package main.Leetcode.day2;

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。
// 递归&分治

import java.util.ArrayList;
import java.util.Arrays;

public class Leet169 {

    // 方法1 排序 NlogN
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int i = nums[nums.length / 2];
//        return i;
//    }
    //3 :暴力count计数
    //4: map计数 O（n） map查找为o(1)

    // 方法2 分治

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i = nums[nums.length / 2];
        return i;
    }

    public static void main(String args[]) {
        System.out.println(2 / 2);
        System.out.println(3 / 2);
    }
}
