package main.剑指offer.第三阶段刷题;

public class JZ16 {
    public double myPow(double x, int n) {
        return n > 0 ? quickMul(x, n) : 1 / quickMul(x, n);
    }

    public double quickMul(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double y = quickMul(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

    public static void main(String args[]) {
        JZ16 jz16 = new JZ16();
        System.out.println(jz16.myPow(2, -2147483648));
    }
    //2.00000
    //-2147483648
}
