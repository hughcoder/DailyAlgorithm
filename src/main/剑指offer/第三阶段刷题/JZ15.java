package main.剑指offer.第三阶段刷题;

public class JZ15 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;

    }
}
