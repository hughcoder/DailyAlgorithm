package main.剑指offer第一轮刷题;

//给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
// 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
//对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
public class JZ51 {
    //输入: [1,2,3,4,5]
    //输出: [120,60,40,30,24]
    public int[] multiply(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int singsum = 1;
            for (int j = 0; j < a.length; j++) {
                if (i == j) {

                } else {
                    singsum = singsum * a[j];
                }
            }
            b[i] = singsum;
        }
        return b;
    }

    public static void main(String args[]) {
        JZ51 jz51 = new JZ51();
        int[] a = {1, 2, 3, 4, 5};
        int[] c = jz51.multiply(a);
        for (int x : c) {
            System.out.println("---->" + x);
        }
    }
}
