package main.剑指offer.第三阶段刷题;

public class JZ64 {
    //求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
    public int sumNums(int n) {

        return (1 + n) * n / 2;

    }

    public static void main(String args[]) {
        JZ64 jz64 = new JZ64();
        System.out.println(jz64.sumNums(3));
    }
}
