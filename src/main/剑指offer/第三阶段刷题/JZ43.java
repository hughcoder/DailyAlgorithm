package main.剑指offer.第三阶段刷题;

public class JZ43 {
    //输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
    //
    //例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。

    public int countDigitOne(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<=n;i++){
            sb.append(i);
        }
        int count = 0;
        String str = sb.toString();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
    public static void main(String args[]) {
        JZ43 jz43 = new JZ43();
        System.out.println(jz43.countDigitOne(12));
    }
}
