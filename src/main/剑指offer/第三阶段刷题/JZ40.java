package main.剑指offer.第三阶段刷题;

import java.util.Arrays;

public class JZ40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] target = new int[k];
        for(int i =0;i<k;i++){
            target[i] = arr[i];
        }
        return target;

    }
}
