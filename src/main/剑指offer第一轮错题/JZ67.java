package main.剑指offer第一轮错题;

public class JZ67 {
    public int cutRope(int target) {

        if (target == 0) {
            return 0;
        }

        int count3 = 0;

        while (target > 3) {
            count3++;
            target = target - 3;
            if (target == 4) {
                break;
            }
        }

        return (int) (Math.pow(3, count3) * target);

    }

    public static void main(String args[]) {
        JZ67 jz67 = new JZ67();
        System.out.println(jz67.cutRope(8));
    }
}
