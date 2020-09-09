package main.剑指offer.排序练习.归并;

import java.util.Arrays;

public class Merge1 {

    private void mergeSort(int[] a, int low, int high) {
        //终止条件
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        //递归拆左边
        mergeSort(a, low, mid);
        //递归拆右边
        mergeSort(a, mid + 1, high);
        //都拆完之后开始合并,拆到单个值
        merge(a, low, mid, high);
    }

    private void merge(int[] a, int low, int mid, int high) {
        //第一步先将值拷贝到temp中
        int i = low;
        int j = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;
        while (i <= mid && j <= high) {
            //这有问题
            if (a[i] < a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }

        }
        //如果还有剩余,放入temp中
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
        for (int x : temp) {
            System.out.println("----->" + x);
        }
        System.out.println("分割线哈哈哈哈------------>");

        //将temp数组重新拷回到原数组中
        for (int d = 0; d < temp.length; d++) {
            a[low + d] = temp[d];
        }
    }

    public static void main(String[] args) {
//        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        int a[] = {5, 4,3,2};
        Merge1 merge1 = new Merge1();
        merge1.mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
}
