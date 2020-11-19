package main.剑指offer.第三阶段刷题;


import java.util.Arrays;

public class JZ11 {
    //最小元素
    public int minArray(int[] nums) {
        //二分查找法
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else {
                right -- ;
            }
        }
        return nums[right];
    }

    public int minArray2(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static void main(String args[]) {
        JZ11 jz11 = new JZ11();
        int[] array3 = {1,3,5};
        int[] array2 = {3,4,5,1,2};
        int[] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        System.out.println(jz11.minArray(array));
        System.out.println(jz11.minArray(array2));
        System.out.println(jz11.minArray(array3));
    }
}
