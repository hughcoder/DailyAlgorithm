package main.剑指offer第一轮错题;

import java.util.Arrays;

//来判断字符串是否表示数值
public class JZ53 {
    //这道题纯判断 （不会自动机）
    //1.符合规定数字符号（不符合规定返回false）
    //2.（小数点判断）只有一个小数点,小数点前面不能出现e
    //3.（符号判断）不能有连续符号 且他前面必须要有e或者放在首位
    //4.e后面要接数字和符号(e不能放末尾 比如 题目12e要false)

    public boolean isNumeric(char[] str) {
        boolean isDot = false;
        boolean isHase = false;
        boolean isSymbol = false;
        boolean isNumber = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'e' || str[i] == 'E') {
                isHase = true;
                if (i == str.length - 1) {
                    return false;
                }
            } else if (str[i] >= '0' && str[i] <= '9') {
                isNumber = true;
            } else if (str[i] == '+' || str[i] == '-') {
                isSymbol = true;
                if (str[i + 1] == '+' || str[i + 1] == '-') {
                    return false;
                }
                if (i != 0) {
                    if (!isHase) {
                        return false;
                    }
                }
            } else if (str[i] == '.') {
                if (isDot) {
                    return false;
                }
                if(isHase){
                    return false;
                }
                isDot = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        JZ53 jz53 = new JZ53();
//        String str = "123.45e+6";
//        String str = "100";
        String str = "12e+5.4";
        char[] a = str.toCharArray();
        System.out.println(jz53.isNumeric(a));
    }
}
