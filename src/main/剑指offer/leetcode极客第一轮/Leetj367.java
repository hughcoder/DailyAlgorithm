package main.剑指offer.leetcode极客第一轮;

public class Leetj367 {
    //给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。

    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        for (int i = 3; i <= num; i++) {
            if (num / i == i) {
                System.out.println(num/i);
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Leetj367 leetj367 = new Leetj367();
        System.out.println(leetj367.isPerfectSquare(5));
//        System.out.println(leetj367.isPerfectSquare(25));
//        System.out.println(leetj367.isPerfectSquare(16));
//        System.out.println(leetj367.isPerfectSquare(14));
    }
}
