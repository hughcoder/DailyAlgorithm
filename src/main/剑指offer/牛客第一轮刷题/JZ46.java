package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;

public class JZ46 {

    //0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
    //
    //例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，
    // 因此最后剩下的数字是3。
    //输入: n = 5, m = 3
    //输出: 3

    //每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
    // 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
    // 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,
    // 继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
    // 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
    //
    //如果没有小朋友，请返回-1
    //约瑟夫环

    public int LastRemaining_Solution(int n, int m) { //n个人 删除m位
        if (n <= 1) {
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int startIndex = 0;
        while (n > 1) {
            //       idx = (idx + m - 1) % n;
            startIndex = (startIndex + m - 1) % n;//不能用list的大小，list每次都会变
            list.remove(startIndex);
            n--;
        }

        return list.get(0);
    }

    public static void main(String args[]) {
        JZ46 jz46 = new JZ46();
        System.out.println(jz46.LastRemaining_Solution(5, 3));
    }


}
