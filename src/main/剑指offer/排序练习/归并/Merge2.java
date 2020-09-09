package main.剑指offer.排序练习.归并;

import java.util.Arrays;

public class Merge2 {
    //先拆到单个
    //合成 1.先合到一个临时数组中 2.在将temp移动到原来的数组

    private void mergeSort(int a[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    private void merge(int a[], int low, int mid, int high) {
        //构建左右数组
        int i = low;
        int j = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) { //假设分成只有一个数子 所以必须要去到等号
            if (a[i] < a[high]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            temp[k] = a[i];
            k++;
            i++;
        }

        while (j <= high) {
            temp[k] = a[j];
            k++;
            j++;
        }

        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }

    }

    public static void main(String[] args) {
//        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        int a[] = {5, 4, 3, 2};
        Merge2 merge1 = new Merge2();
        merge1.mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
}
