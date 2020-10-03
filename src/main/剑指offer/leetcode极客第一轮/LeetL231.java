package main.剑指offer.leetcode极客第一轮;

public class LeetL231 {
    //n > 0 且 n & (n - 1) == 0
        public boolean isPowerOfTwo(int n) {
            return n > 0 && (n & n - 1) == 0;
        }
}
