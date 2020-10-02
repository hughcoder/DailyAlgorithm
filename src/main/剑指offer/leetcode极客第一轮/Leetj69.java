package main.剑指offer.leetcode极客第一轮;

public class Leetj69 {
    //计算并返回 x 的平方根，其中 x 是非负整数。
    //由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
    public int mySqrt(int x) {

        int left = 0;
        int right = x / 2 + 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            int square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        Leetj69 leetj69 = new Leetj69();

        System.out.println(leetj69.mySqrt(8));
        System.out.println(leetj69.mySqrt(4));
    }
}
