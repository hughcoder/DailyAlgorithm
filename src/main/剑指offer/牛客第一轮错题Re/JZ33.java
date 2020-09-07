package main.剑指offer.牛客第一轮错题Re;

public class JZ33 {
    public int GetUglyNumber_Solution(int index) {
        if(index == 0){return 0;}
        int[] dp = new int[index]; //第i个丑数
        int a = 0, b = 0, c = 0;
        dp[0] = 1;
        for (int i = 1; i < index; i++) {
            int num2 = dp[a] * 2, num3 = dp[b] * 3, num5 = dp[c] * 5;
            dp[i] = Math.min(num2, Math.min(num3, num5));
            if (dp[i] == num2) {
                a++;
            }
            if (dp[i] == num3) {
                b++;
            }
            if (dp[i] == num5) {
                c++;
            }

        }
        return dp[index-1];
    }





    public static void main(String args[]) {
        JZ33 jz33 = new JZ33();
        System.out.println(jz33.GetUglyNumber_Solution(2));

    }
}
