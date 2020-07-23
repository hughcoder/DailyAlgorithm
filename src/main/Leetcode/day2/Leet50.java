package main.Leetcode.day2;

public class Leet50 {
//    public double myPow(double x, int n) {
//
//        return Math.pow(x,n);
//    }


    public static double quickMul(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double y = quickMul(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

    public static double myPow(double x, int n) {

        return n > 0 ? quickMul(x, n) : 1 / quickMul(x, n);
    }

    public static void main(String args[]) {
        System.out.println(myPow(2, 5));
        System.out.println(myPow(2, -1));
    }

}
