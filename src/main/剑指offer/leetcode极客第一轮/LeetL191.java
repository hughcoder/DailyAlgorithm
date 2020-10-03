package main.剑指offer.leetcode极客第一轮;

public class LeetL191 {
    //将 n 和 n - 1 与运算总是能把 nn 中最低位的 1 变成 0 ，并保持其他位不变。 每次去掉一次1
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            n = n & (n - 1);
            sum++;
        }
        return sum;
    }
}
