package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;

//对应ppt12  //随便用数字代替数组也行 数字++--也行  没什么好写的题目
public class Leetg860 {
    public boolean lemonadeChange(int[] bills) {
        ArrayList<Integer> list5 = new ArrayList<>();
        ArrayList<Integer> list10 = new ArrayList<>();

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                list5.add(5);
            } else if (bills[i] == 10) {
                if (list5.isEmpty()) {
                    return false;
                } else {
                    list10.add(10);
                    list5.remove(0);
                }
            } else if (bills[i] == 20) {
                if (list10.isEmpty()) {
                    if (list5.size() < 3) {
                        return false;
                    } else {
                        list5.remove(0);
                        list5.remove(0);
                        list5.remove(0);
                    }
                } else {
                    if (list5.size() < 1) {
                        return false;
                    } else {
                        list10.remove(0);
                        list5.remove(0);
                    }
                }
            }
        }
        return true;
    }
}
