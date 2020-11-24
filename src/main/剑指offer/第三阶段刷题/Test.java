package main.剑指offer.第三阶段刷题;

public class Test {

    private int getRealIndex(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String args[]) {
        Test test = new Test();
        System.out.println(test.getRealIndex(30));

        System.out.println(9&(9-1));


    }
}
