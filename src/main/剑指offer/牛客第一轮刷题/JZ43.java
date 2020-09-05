package main.剑指offer.牛客第一轮刷题;

public class JZ43 {
    public String LeftRotateString(String str, int n) {

        int len = str.length();
        if (len == 0) {
            return "";
        }
        if (n > len) {
            n = n % len;
        }

        String str1 = str.substring(0,n);
        String str2 = str.substring(n,str.length());

        return str2+str1;

    }

    public static void main(String args[]) {
        JZ43 jz43 = new JZ43();
        System.out.println(jz43.LeftRotateString("abcXYZdef",3));
    }
}
