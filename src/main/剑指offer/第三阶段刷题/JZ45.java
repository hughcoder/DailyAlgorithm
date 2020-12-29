package main.剑指offer.第三阶段刷题;

import java.util.Arrays;

public class JZ45 {
    //输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
    //递归+剪枝
    public String minNumber(int[] nums) {

        String[] strs = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for(String d : strs){
            sb.append(d);
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        JZ45 jz45 = new JZ45();
        int[] nums = {10,2};
        int[] nums2 = {3,30,34,5,9};
        System.out.println(jz45.minNumber(nums));
        System.out.println(jz45.minNumber(nums2));
    }
}
