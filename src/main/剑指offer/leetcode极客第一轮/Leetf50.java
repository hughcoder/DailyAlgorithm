package main.剑指offer.leetcode极客第一轮;

public class Leetf50 {
    //实现 pow(x, n) ，即计算 x 的 n 次幂函数。

    public double myPow(double x, int n) {
        return n>0 ? quickMul(x, n) : 1 / quickMul(x, n);
    }

    public double quickMul(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double y = quickMul(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

    public static void main(String args[]) {
        Leetf50 leetf50 = new Leetf50();
        System.out.println(leetf50.myPow(2, 2));
        System.out.println(leetf50.myPow(2, -2));
    }
}
