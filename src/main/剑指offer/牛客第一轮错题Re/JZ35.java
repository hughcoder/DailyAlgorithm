package main.剑指offer.牛客第一轮错题Re;

public class JZ35 {
    //第一步 先按归并模版写一个归并函数
    //第二步 考虑如何计算逆序队 则后面的数字需要往前移动多少个位置则是
    // 当a[j]<a[i]时 在 j 指向的元素赋值回去的时候，给计数器加上 mid - i + 1
    private int AllCount = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return AllCount;
    }

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
        int i = low; //左边数组
        int j = mid + 1; //右边数组
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) { //假设分成只有一个数子 所以必须要去到等号
            if (a[i] <= a[j]) {
                //存放是左边数组
//                System.out.println("count--->" + (high - j + 1));
//                AllCount += high - j + 1;
                temp[k] = a[i];
                k++;
                i++;
            } else {
//                System.out.println("a[j]--->" + a[j]);
                AllCount +=(mid - i + 1);
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
//        int[] array = {7, 5, 6, 4};
        int[] array = {1, 3, 2, 3,1};
        JZ35 jz35 = new JZ35();
        System.out.println(jz35.reversePairs(array));
        for (int x : array) {
            System.out.println("x------>" + x);
        }

    }
}
