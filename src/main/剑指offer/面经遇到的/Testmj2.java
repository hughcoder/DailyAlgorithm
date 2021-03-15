package main.剑指offer.面经遇到的;

import main.剑指offer.牛客第一轮错题Re.JZ4;

import java.util.ArrayList;
import java.util.HashMap;

//删除数组中的重复元素
//26. 删除排序数组中的重复项 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
public class Testmj2 {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                nums[j] = nums[i];
                j++;
            }
            map.put(nums[i], 1);
        }
        System.out.println(nums);
        return j + 1;
    }

//    public int removeDuplicates(int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//        int p = 0;
//        int q = 1;
//        while(q < nums.length){
//            if(nums[p] != nums[q]){
//                nums[p + 1] = nums[q];
//                p++;
//            }
//            q++;
//        }
//        return p + 1;
//    }



    public static void main(String args[]) {
        int[] a = {1, 1, 2};
        int[] b = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Testmj2 testmj2 = new Testmj2();
        System.out.println(testmj2.removeDuplicates(a));
        System.out.println(testmj2.removeDuplicates(b));
//        System.out.println(testmj2.removeDuplicates(a));
    }
}
