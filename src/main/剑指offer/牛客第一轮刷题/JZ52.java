package main.剑指offer.牛客第一轮刷题;

//请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
// 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
//竟然要用动态规划
public class JZ52 {

    public boolean match(char[] str, char[] pattern) {
           String str1 = String.valueOf(str);
           String str2 = String.valueOf(pattern);

           return str1.matches(str2);


    }
}
