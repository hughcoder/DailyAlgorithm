package main.剑指offer.牛客第一轮错题Re;

public class JZ52 {
    public boolean match(char[] str, char[] pattern) {
        int m = str.length;
        int n = pattern.length;
        if (m == 0 && n == 0) {
            return true;
        }
        //dp方程定义
        boolean[][] dp = new boolean[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    //正则为空的话 字符串为空才符合
                    dp[i][0] = i == 0;
                } else {
                    if (pattern[j - 1] != '*') { //判断前一个字符是否是*，因为*号让当前字符可以变化
                        if (i > 0 && (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.')) {
                            dp[i][j] = dp[i - 1][j - 1];  //当前判断结果为前一个判断
                        }
                    } else {
                        //两种 0个c或者多个c 这里要或等于 不然会覆盖错误的情况
                        if (j >= 2) {
                            dp[i][j] |= dp[i][j - 2];
                        }
                        //如果看成n个c需要做比较 这里j-1表示*号前面的一个字符
                        if (i >= 1 && j >= 2 && (str[i - 1] == pattern[j - 2] || pattern[j - 2] == '.')) {
                            //这时候j不动
                            dp[i][j] |= dp[i - 1][j];
                        }
                    }
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String a = "a";
        String b = ".*";
        JZ52 jz52 = new JZ52();
        System.out.println(jz52.match(a.toCharArray(), b.toCharArray()));
    }
}
