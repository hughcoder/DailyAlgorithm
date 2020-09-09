package main.剑指offer.牛客第一轮错题Re;

import java.util.Arrays;

public class MergeSort {
    //将分出来的各个部分进行排序
    public static void merge(int a[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[high - low + 1];//需要一个辅助数组来存放数据
        //先将较小的数先移到数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
//最后将temp数组的数覆盖到原来的数组a[]中
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

    public static void mergeSort(int a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            //左边
            mergeSort(a, low, mid);
            //右边
            mergeSort(a, mid + 1, high);
            //将两边归并
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
//        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        int a[] = {5,4,3,2};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
}

