package main.剑指offer.leetcode极客第一轮;

import java.util.Arrays;

public class Leetm300 {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                // 到达每一个数的时候，前方有多少个按顺序小于他的数
               if(nums[j]<nums[i]){
                   dp[i] = Math.max(dp[i],dp[j]+1); //nums[i] 可以接在 nums[j]之后
               }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = {10, 9, 2, 5, 3, 7, 101, 18};
        Leetm300 Leetm300 = new Leetm300();
        System.out.println(Leetm300.lengthOfLIS(a));
    }


}
