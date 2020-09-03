package main.剑指offer第一轮错题;

public class JZ52 {
    //正则表达式
    public boolean match(char[] str, char[] pattern) {
        int n = str.length;
        int m = pattern.length;
        boolean[][] dp = new boolean[n + 1][m + 1]; //这边加1主要为了能在循环里判断0,0的情况

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //首先判断是否空正则 空正则对应的字符串结果是固定的
                if (j == 0) {
                    dp[i][j] = i == 0;
                } else {
                    //判断字符 . 和*
                    if (pattern[j - 1] != '*') {
                        if (i > 0 && str[i-1] == pattern[j-1] || pattern[j-1] == '*') {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        //判断0个c还是多个c  (两种都可以走)
                        //0个c
                        if (j >= 2) {
                            dp[i][j] = dp[i][j - 2]; // aabc ,aad*bc (*表示前面的字符)
                        }
                        //多个c
                        if (i >= 1 && j >= 2 && pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.') {
                            dp[i][j] = dp[i - 1][j];
                        }

                    }
                }

            }
        }
        return dp[n][m];
    }

    public static void main(String args[]) {
        JZ52 jz52 = new JZ52();
        char[] a = {'a', 'a', 'b', 'c'};
        char[] b = {'a', 'a', 'd', '*', 'b', 'c'};
        System.out.println(jz52.match(a, b));
    }
}
