package main.剑指offer第一轮刷题;

public class JZ53 {
    //请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
    // 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。

    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }

        boolean isNum = false, isDot = false, ise_or_E = false;//标记是否遇到数位 、小数点、'e'或E

        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') { //第一种情况 全是数字
                isNum = true;
            } else if (str[i] == '.') {
                if (isDot || ise_or_E) {
                    return false;
                }
                isDot = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (!isNum || ise_or_E) {
                    return false;
                } //e’或'E'前面必须有整数，且前面不能重复出现‘e’或'E
                ise_or_E = true; // 标记已经遇到‘e’或'E'
                isNum = false; // 重置isNum，因为‘e’或'E'之后也必须接上整数，防止出现 123e或者123e+的非法情况
            } else if (str[i] == '-' || str[i] == '+') {
                if (i != 0 && str[i - 1] != 'e' && str[i - 1] != 'E')
                    return false; // 正负号只可能出现在第一个位置，或者出现在‘e’或'E'的后面一个位置
            } else return false; // 其它情况均为不合法字符
        }

        return isNum;
    }
}
