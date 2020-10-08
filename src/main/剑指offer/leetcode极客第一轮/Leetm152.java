package main.剑指offer.leetcode极客第一轮;

public class Leetm152 {
    //给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
    //令imax为当前最大值，则当前最大值为 imax = max(imax * nums[i], nums[i])
    //由于存在负数，那么会导致最大的变最小的，最小的变最大的。因此还需要维护当前最小值imin，imin = min(imin * nums[i], nums[i])

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i],nums[i]);
            imin = Math.min(imin*nums[i],nums[i]);

            max = Math.max(max,imax);

        }
        return max;
    }

    public static void main(String args[]) {
        Leetm152 leetm123 = new Leetm152();
        int[] a = {2, 3, -2, 4};
        int[] b = {-2, 0, -1};
        System.out.println(leetm123.maxProduct(a));
        System.out.println(leetm123.maxProduct(b));
    }
}
