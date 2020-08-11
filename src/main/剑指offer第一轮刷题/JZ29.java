package main.剑指offer第一轮刷题;

import java.util.ArrayList;
import java.util.Collections;

public class JZ29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int x : input) {
            arrayList.add(x);
        }
        if(k>input.length){
            return new ArrayList<>();
        }
        if(input.length == 0){
            return new ArrayList<>();
        }


        Collections.sort(arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            arrayList2.add(arrayList.get(i));
        }
        return arrayList2;
    }
}
