package main.剑指offer第一轮错题;

public class JZ33 {
    //dp方程定义 dp[i] 代表第i个丑数的值
    //dp方程公式 假设有数组（2，3，5）， 下一个数组内每一个数*2，*3，*5中的其中一个
    //即 dp[i] = min(dp[a]*2,dp[b]*3,dp[c]*5) //a,b,c 属于数组 0,n-1

    public int GetUglyNumber_Solution(int index) {
        if(index == 0){
            return 0;
        }
        int[] dp = new int[index];
        dp[0] = 1;
        int a = 0, b = 0, c = 0; //代表某有序丑数数组的索引
        for (int i = 1; i < index; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;//n2,n3,n5代表该数组里下一个丑数
            dp[i] = Math.min(n2, Math.min(n3, n5));
            if (dp[i] == n2) {
                a++;
            }
            if (dp[i] == n3) {
                b++;
            }
            if (dp[i] == n5) {
                c++;
            }
        }
        return dp[index - 1];
    }


}
