package main.剑指offer第一轮错题;

public class JZ10 {

    //d(n) = d(n-1) + d(n-2);
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }

    public static void main(String args[]) {

        JZ10 jz10 = new JZ10();

        System.out.println(jz10.RectCover(50));
    }

}
