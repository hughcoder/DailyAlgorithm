package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;
import java.util.Collections;

//数据流的中位数

public class JZ63 {
    ArrayList<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public Double GetMedian() {
        if (!list.isEmpty()) {
            if (list.size() % 2 != 0) {//奇数
                if (list.size() == 1) {
                    return Double.valueOf(list.get(0));
                }
                return Double.valueOf(list.get(list.size() / 2));
            } else {
                double a1 = list.get(list.size() / 2-1);
                double a2 = list.get(list.size() / 2);
                return  ((a1 + a2) / 2);
            }
        }
        return (double) 0;
    }
}
