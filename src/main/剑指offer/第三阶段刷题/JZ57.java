package main.剑指offer.第三阶段刷题;

public class JZ57 {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int[] a = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                a[0] = nums[left];
                a[1] = nums[right];
                return a;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return a;

    }
    public static void main(String args[]) {
        JZ57 jz57 = new JZ57();
        int a[] = {2,7,11,15};
        jz57.twoSum(a,9);
    }
}
