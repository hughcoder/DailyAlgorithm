package main.剑指offer.leetcode极客第二轮;

public class Leetj367 {
    public boolean isPerfectSquare(int num) {
        if (num <= 2) {
            return true;
        }
        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2 ;
            long square = mid * mid;
            if (square == num) {
                return true;
            }
            if (square > num) {
                right = mid - 1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Leetj367 leetj69 = new Leetj367();
        System.out.println(leetj69.isPerfectSquare(14));
        System.out.println(leetj69.isPerfectSquare(16));
    }
}
