package main.剑指offer.第三阶段刷题;

public class JZ43 {

    //输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
    //
    //例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
    public int countDigitOne(int n) {
        int dight = 1;
        int res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                res += high * dight;
            } else if (cur == 1) {
                res += high * dight + low + 1;
            } else {
                res += (high + 1) * dight;
            }
            low += cur * dight;
            cur = high % 10;
            high /= 10;
            dight *= 10;
        }
        return res;
    }

    public static void main(String args[]) {
        JZ43 jz43 = new JZ43();
        System.out.println(jz43.countDigitOne(12));

    }
}
