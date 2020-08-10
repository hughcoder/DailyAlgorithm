package main.剑指offer第一轮刷题;

import java.util.Arrays;

public class JZ6 {
    public static int minNumberInRotateArraysort(int[] array) {
        Arrays.sort(array); //排序
        return array[0];
    }

    public int minArray(int[] numbers) {
        //主要使用二分查找法
        if (numbers.length == 0) {
            return -1;
        }
        int i = 0;
        int j = numbers.length - 1;
        int mid = 0;
        while (i < j) {
            mid = i + (j - i) / 2;
            if (numbers[mid] < numbers[j]) {
                i = mid + 1;
            } else if (numbers[mid] > numbers[j]) {
                j = mid;
            } else {
                j--;
            }
        }
        return numbers[i];
    }

    public static int minNumberInRotateArray(int[] array) {
        //主要使用二分查找法
        if (array.length == 0) {
            return -1;
        }
        int i = 0;
        int j = array.length - 1;
        int mid = 0;
        while (i < j) {
            mid = i + (j - i) / 2;
            if (array[mid] > array[j]) {
                i = mid + 1;
            } else if (array[mid] < array[j]) {
                j = mid;
            } else {
                j--;
            }
        }
        return array[i];
    }

    public static void main(String args[]) {
        int[] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        System.out.println(minNumberInRotateArray(array));
    }
}
