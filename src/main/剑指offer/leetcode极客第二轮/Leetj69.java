package main.剑指offer.leetcode极客第二轮;

public class Leetj69 {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (left < right) {
            long mid = left + (right - left) / 2 + 1;//中位数加1小技巧，在边界问题可以解决
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

    public static void main(String args[]) {
        Leetj69 leetj69 = new Leetj69();
        System.out.println(leetj69.mySqrt(4));
        System.out.println(leetj69.mySqrt(8));
    }
}
