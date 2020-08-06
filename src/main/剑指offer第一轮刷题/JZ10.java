package main.剑指offer第一轮刷题;

public class JZ10 {

    //我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
    // 总共有多少种方法？
    //比如n=3时，2*3的矩形块有3种覆盖方法：
    //数学规律
    //n=1  sum =1;
    //n=2  sum =2;
    //n=3  sum =3;
    //n=4  sum =5;
    // d(n) = d(n-1) + d(n-2);

    public static int RectCover(int target) {
        if (target <=2 ) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }

    public static void main(String args[]) {
        System.out.println(RectCover(4));
    }
}
