package main.剑指offer.牛客第一轮刷题;

public class JZ9 {
    //数学规律
    public static int JumpFloorII(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return 2 * JumpFloorII(target - 1);
        }

    }


    public static void main(String args[]) {
        System.out.println(JumpFloorII(3));
    }
}
