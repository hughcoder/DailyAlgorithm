package main.剑指offer第一轮刷题.位运算;

public class Leet231 {
    public static boolean isPowerOfTwo(int n) {

        if(n == 1){
            return true;
        }
        if(n == 0){
            return false;
        }
        while (n != 2) {
            if (n % 2 == 1) {
                return false;
            } else {
                n = n / 2;
            }
        }

        return true;

    }

    public static void main(String args[]) {
        System.out.println( isPowerOfTwo(8));;
    }
}
