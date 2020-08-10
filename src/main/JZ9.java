package main;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class JZ9 {

    public static void main(String[] args) {

        int e = M(3, 6);
        int f = W(3, 6);
        System.out.println(e);
        System.out.println(f);

    }


    public static int M(int a, int b) {
        int x;

        if (a < b) {
            x = a;
            a = b;
            b = x;
            //a b 数值交换

        }

        if (b == 0) {
            return a;
        } else {
            return M(b, a & b);
            //递归 辗转取于
        }


    }


    public static int W(int a, int b) {

        return (a * b) / M(a, b);
    }


}
