package main.剑指offer第一轮刷题;

public class JZ49 {
    //将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
//+2147483647 ,  //首先判断第一位是不是符号位，后续判断是否在0-9之间
    public int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if (((str.charAt(0) == '+' || str.charAt(0) == '-') && str.length() > 1) || (str.charAt(0) >= '0' && str.charAt(0) <= '9')) { //防止只有一个符号

                } else {
                    return 0;
                }
            } else {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {

                } else {
                    return 0;
                }
            }
        }

        return Integer.parseInt(str);
    }

    public static void main(String args[]) {
        JZ49 jz49 = new JZ49();
        System.out.println(jz49.StrToInt("+"));
    }
}
