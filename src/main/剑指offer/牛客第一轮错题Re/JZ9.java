package main.剑指offer.牛客第一轮错题Re;

public class JZ9 {
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
