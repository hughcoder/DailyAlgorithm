package main.剑指offer.牛客第一轮刷题;

public class JZ11 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
