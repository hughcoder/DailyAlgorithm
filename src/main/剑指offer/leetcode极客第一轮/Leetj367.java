package main.剑指offer.leetcode极客第一轮;

public class Leetj367 {
    //给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;//取右边的中位数
            System.out.println("---->"+mid);
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Leetj367 leetj367 = new Leetj367();
        System.out.println(leetj367.isPerfectSquare(25));
//        System.out.println(leetj367.isPerfectSquare(25));
//        System.out.println(leetj367.isPerfectSquare(16));
//        System.out.println(leetj367.isPerfectSquare(14));
    }
}
