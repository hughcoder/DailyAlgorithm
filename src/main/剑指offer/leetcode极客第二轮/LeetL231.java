package main.剑指offer.leetcode极客第二轮;

public class LeetL231 {
    // n&(n-1) 异或 x & (x - 1) 可以将最右边的 1 设置为 0。 与运算符（&）
    //n>0是去除0的判断 对于2的N次都满足 (n & (n - 1)) == 0
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
