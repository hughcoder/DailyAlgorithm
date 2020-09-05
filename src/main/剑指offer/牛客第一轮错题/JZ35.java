package main.剑指offer.牛客第一轮错题;

//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。

public class JZ35 {

    public int reversePairs(int[] nums) {
        int len = nums.length;

        if (len < 2) {
            return 0;
        }

        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }

        int[] temp = new int[len];
        return reversePairs(copy, 0, len - 1, temp);
    }


    private int reversePairs(int[] nums, int left, int right, int[] temp) {
        if (left == right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int leftPairs = reversePairs(nums, left, mid, temp);
        int rightPairs = reversePairs(nums, mid + 1, right, temp);

        // 如果整个数组已经有序，则无需合并，注意这里使用小于等于
        if (nums[mid] <= nums[mid + 1]) {
            return leftPairs + rightPairs;
        }

        int crossPairs = mergeAndCount(nums, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }


    private int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }

        int i = left;
        int j = mid + 1;

        int count = 0;
        for (int k = left; k <= right; k++) {
            // 有下标访问，得先判断是否越界
            if (i == mid + 1) {
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                // 注意：这里是 <= ，写成 < 就不对，请思考原因
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;

                // 在 j 指向的元素归并回去的时候，计算逆序对的个数，只多了这一行代码
                count += (mid - i + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 6, 4};
        JZ35 jz35 = new JZ35();
        System.out.println(jz35.reversePairs(array));
    }

}
