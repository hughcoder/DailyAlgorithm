package main.剑指offer.牛客第一轮错题;

import java.util.ArrayList;
import java.util.Arrays;

public class JZ45 {
    //扑克牌顺子
    //12345  //12305 /12005
    //1.排除重复 2.相差值<=4;判空
    public boolean isContinuous(int[] numbers) {
        if (numbers.length == 0) {
            return false;
        }

        Arrays.sort(numbers);
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                list.add(numbers[i]);
            }
        }

        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i++) {
                int ca = list.get(i) - list.get(i - 1);
                if (ca == 0) {
                    return false;
                }
                sum += ca;
            }
            if (sum <= 4) {
                return true;
            }
            if (sum - 1 < numbers.length - list.size()) {
                return true;
            }
        } else {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 0};
        JZ45 jz45 = new JZ45();
        System.out.println(jz45.isContinuous(array));
    }
}
