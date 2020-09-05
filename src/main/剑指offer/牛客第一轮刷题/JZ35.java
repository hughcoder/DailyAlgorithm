package main.剑指offer.牛客第一轮刷题;

public class JZ35 {
    //在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
//https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/solution/shu-zu-zhong-de-ni-xu-dui-by-leetcode-solution/
    //思路：归并排序 还没写 还没看

    public static int InversePairs(int[] array) {
        if (array == null) return 0;
        int[] tmp = new int[array.length];
        return mergeSort(array, tmp, 0, array.length - 1);
    }

    //归并排序，递归
    private static int mergeSort(int[] array, int[] tmp, int low, int high) {
        if (low >= high) return 0;
        int res = 0, mid = low + (high - low) / 2;
        res += mergeSort(array, tmp, low, mid);
        res %= 1000000007;
        res += mergeSort(array, tmp, mid + 1, high);
        res %= 1000000007;
        res += merge(array, tmp, low, mid, high);
        res %= 1000000007;
        return res;
    }

    //归并排序，合并
    private static int merge(int[] array, int[] tmp, int low, int mid, int high) {
        int i = low, i1 = low, i2 = mid + 1;
        int res = 0;
        while (i1 <= mid && i2 <= high) {
            if (array[i1] > array[i2]) {
                res += mid - i1 + 1;
                res %= 1000000007;
                tmp[i++] = array[i2++];
            } else
                tmp[i++] = array[i1++];
        }
        while (i1 <= mid)
            tmp[i++] = array[i1++];
        while (i2 <= high)
            tmp[i++] = array[i2++];
        for (i = low; i <= high; i++)
            array[i] = tmp[i];
        return res;
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 6, 4};
        System.out.println(InversePairs(array));
    }

}
