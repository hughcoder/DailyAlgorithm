package main.剑指offer.牛客第一轮刷题.位运算;

// x&(x-1)  可以去除末尾最后的1
//举个例子 24 11000 ， 23 10111
// 11000
// 10111
// 10000 //&与 都会1才为1
public class Leet199 {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(hammingWeight(10));
    }
}
