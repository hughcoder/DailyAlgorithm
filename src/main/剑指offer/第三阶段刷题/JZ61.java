package main.剑指offer.第三阶段刷题;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JZ61 {
    //从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，
    // A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。

    //是顺子需要满足两个条件
    //1.不重复 切最大值 - 最小值 < 5

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> repeat = new HashSet<>();
        int min = 14;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                continue;
            }
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
            if(repeat.contains(nums[i])) return false; // 若有重复，提前返回 false
            repeat.add(nums[i]); // 添加此牌至 Set
        }
        return max - min<5;

    }

    public static void main(String args[]) {
        JZ61 jz61 = new JZ61();
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {0, 0, 1, 2, 5};
        System.out.println(jz61.isStraight(nums));
        System.out.println(jz61.isStraight(nums2));
    }
}
