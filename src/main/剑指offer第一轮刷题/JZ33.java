package main.剑指offer第一轮刷题;

public class JZ33 {

    //把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。
    // 求按从小到大的顺序的第N个丑数。
    //思路：有很多种定义方式
    //但是需要做到不超时 还是要用动态规划

    public int GetUglyNumber_Solution(int index) {
        if(index == 0){
            return 0;
        }
        int[] dp = new int[index];
        dp[0] = 1;
        int a =0,b=0,c =0;
        for(int i=1;i<index;i++){
            int n1 =2*dp[a],n2 =3*dp[b],n3=5*dp[c];
            dp[i] = Math.min(n1,Math.min(n2,n3));
            if(n1 == dp[i]){a++;}
            if(n2 == dp[i]){b++;}
            if(n3 == dp[i]){c++;}
        }
        return dp[index-1];
    }
}
