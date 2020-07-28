package main.Leetcode.day4;

//计算并返回 x 的平方根，其中 x 是非负整数。
public class Leet36 {
    public int mySqrt(int x) {
        //注意left不为0，应该为1 否则下面可能出现 x/0的情况
        int left = 1;
        int right = x;
        int res =0 ;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    //牛顿迭代法

    public int mySqrt2(int a) {
        long x = a;
        while (x * x > a) {
            x = (x + a / x) / 2;
        }
        return (int) x;
    }


}
