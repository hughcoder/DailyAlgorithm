package main.剑指offer.牛客第一轮刷题;

public class JZ67 {
    //需要看为什么3是最优解的求导
    public int cutRope(int target) {
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        if (target == 4) {
            return 4;
        }
        int count = 0;
        while (target > 3) {
            if (target == 4) { //333322的切法最大
                break;
            }
            target -= 3;
            count++;
        }
        int sum = 1;
        for (int i = 0; i < count; i++) {
            sum *= 3;
        }

        return sum * target;

    }

    public static void main(String args[]) {
        JZ67 jz67 = new JZ67();
        System.out.println(jz67.cutRope(16));
    }
}
