package main.剑指offer.第三阶段刷题;

public class JZ14g2 {
    public int cuttingRope(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        long sum = 1;

        while (n > 4) {
            sum = sum * 3 % 1000000007;
            n -= 3;
        }
        return (int) (sum * n % 1000000007);

    }
}
