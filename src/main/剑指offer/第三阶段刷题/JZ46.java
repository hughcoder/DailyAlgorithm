package main.剑指offer.第三阶段刷题;

public class JZ46 {
    // 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
    // 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

    // f(i) = { f(i-2)+f(i-1),(若xi-1和xi能被翻译)   f(i-1)}
    //如果两个字符满足 10<num<25
    public int translateNum(int num) {
        String str = String.valueOf(num);
        int[] dp = new int[str.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= str.length(); i++) {
            String curStr = str.substring(i - 2, i);
            int curNum = Integer.parseInt(curStr);
            if(curNum>=10&&curNum<=25){
                dp[i] = dp[i-1]+dp[i-2];
            }else {
                dp[i] = dp[i-1];
            }
        }
        return dp[str.length()];
    }

    public static void main(String args[]) {
        JZ46 jz46 = new JZ46();
        System.out.println(jz46.translateNum(25));
    }
}
