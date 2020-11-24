package main.剑指offer.第三阶段刷题;

public class JZ14 {
    //2、3、3的三段

    public int cuttingRope(int n) {
        if (n <= 2) {
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int sum = 1;

        while (n > 3) {
            if (n == 4) {
                break;
            } else {
                n = n - 3;
                sum *= 3;
            }
        }
        return sum * n;

    }

    public static void main(String args[]) {
        JZ14 jz14 = new JZ14();
        System.out.println(jz14.cuttingRope(2));
        System.out.println(jz14.cuttingRope(10));
    }
}
