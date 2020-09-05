package main.剑指offer.牛客第一轮错题;


import java.util.Arrays;
import java.util.Comparator;

public class JZ32 {
    public String PrintMinNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            str[i] = String.valueOf(nums[i]);

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1 + s2).compareTo(s2 + s1);
            }
        });

        StringBuilder res = new StringBuilder();
        for (String str1 : str) {
            res.append(str1);
        }

        return res.toString();
    }

    public static void main(String args[]) {
        int[] numbers = {3, 32, 321};
        int[] a = {3334, 3, 3333332};
        JZ32 jz32 = new JZ32();
        System.out.println(jz32.PrintMinNumber(numbers));
    }
}
