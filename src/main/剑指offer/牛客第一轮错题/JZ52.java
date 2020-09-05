package main.剑指offer.牛客第一轮错题;

public class JZ52 {
    //正则表达式
    public boolean match(char[] str, char[] pattern) {
        int n = str.length;
        int m = pattern.length;
        boolean[][] dp = new boolean[n + 1][m + 1]; //这边加1主要为了能在循环里判断0,0的情况

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //先判断 空正则
                if (j == 0) {
                    dp[i][j] = i == 0;
                } else {
                    //非空正则
                    //判断 字母 符号
                    if (pattern[j - 1] != '*') { //通过前一个字符去推当前i,j
                        if (i > 0 && (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.')) {
                            //字母符号 都符合则可以走下去
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        // 0个c或者n个c两种情况
                        //如果看成0个c 则正则往后走2个位置
                        //因为两个都会走 这边用 |= 有一次对就可以了
                        if (j >= 2) {
                            dp[i][j] |= dp[i][j - 2];
                        }

                        //如果看成n个c需要做比较 这里j-1表示*号前面的一个字符
                        if (i >= 1 && j >= 2 && (str[i - 1] == pattern[j - 2] || pattern[j - 2] == '.')) {
                            dp[i][j] |= dp[i - 1][j];
                        }
                    }
                }
            }
        }
        return dp[n][m];
    }

    //关于为什么用|=，比如这段代码： //碰到 * 了，分为看和不看两种情况 //不看 if (j >= 2) { f[i][j] |= f[i][j - 2]; //可用可不用，因为dp矩阵初始化默认为false，本质上和=一样 }
    // 看 if (i >= 1 && j >= 2 && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.')) { f[i][j] |= f[i - 1][j]; //必须使用，否则不能ac }
    //
    //其中，第一步先算的是不看‘*’的情况，然后第二步再算看‘*’的情况。也就是说，对于f[i][j]我们会算两次。
    // 如果在第一次，即不看'*'的时候，就已经算出来TURE了。那在第二步看'*'的时候。不管结果是ture还是false，都保持true不变，
    // 这是合理的，因为只要其中有一种情况能完整匹配，结果就为true。这就是为什么要用或符号。 这个不难证明，举个例子 "ba" "baa*"
    // 这种情况下直接用=号过不了。

    public static void main(String args[]) {
        JZ52 jz52 = new JZ52();
//        char[] a = {'a', 'a', 'b', 'c'};
//        char[] b = {'a', 'a', 'd', '*', 'b', 'c'};
        String a = "aaa";
        String b = "aa*";
        System.out.println(jz52.match(a.toCharArray(), b.toCharArray()));
    }
}
