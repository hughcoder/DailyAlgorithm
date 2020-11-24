package main.剑指offer.第三阶段刷题;

public class JZ16 {
    public double myPow(double x, int n) {

        double sum = 1;
        int num = Math.abs(n);
        for (int i = 0; i < num; i++) {
            sum = sum * x;
        }
        return n > 0 ? sum : 1 / sum;
    }

    public static void main(String args[]) {
        JZ16 jz16  = new JZ16();
        System.out.println(jz16.myPow(2,10));
    }
}
