package main.剑指offer第一轮刷题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class JZ32 {

    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();
    }


    public String PrintMinNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1 + s2).compareTo(s2 + s1);  //比较组合数 让小的数往前排
            }
        });
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }

        return res.toString();

    }

    public static void main(String args[]) {
        int[] numbers = {3, 32, 321};
        int[] a = {3334, 3, 3333332};
        JZ32 jz32 = new JZ32();
        System.out.println(jz32.PrintMinNumber(numbers));
//        System.out.println(jz32.PrintMinNumber(a));

        String s1 = "121";
        String s2 = "333";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
    }

}
