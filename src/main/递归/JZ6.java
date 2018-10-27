package main.递归;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

//每一个台阶都有2个选择，最后一个台阶只有一个选择
public class JZ6 {
    public static int JumpFloorII(int target) {
     return (int)Math.pow(2,target-1);
    }

    public static void main(String args[]){
        System.out.println(  JumpFloorII(3));
    }
}
