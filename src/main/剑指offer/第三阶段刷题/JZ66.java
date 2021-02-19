package main.剑指offer.第三阶段刷题;

public class JZ66 {
    public int[] constructArr(int[] a) {
        if(a.length == 0){
            return new int[0];
        }
        int[] sum = new int[a.length];
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        //初始值
        left[0] = 1;
        right[a.length - 1] = 1;

        //先计算左下角
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        //右下角
        for (int i = a.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }

        for (int i = 0; i < a.length; i++) {
            sum[i] = left[i] * right[i];
        }
        return sum;
    }
}
