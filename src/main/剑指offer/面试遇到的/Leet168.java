package main.剑指offer.面试遇到的;

public class Leet168 {
    //  1 -> A
    //    2 -> B
    //    3 -> C
    //    ...
    //    26 -> Z
    //    27 -> AA
    //    28 -> AB
//除留余数法
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n--;
            sb.append((char)('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();

    }

    public static void main(String args[]) {
        Leet168 leet168 = new Leet168();

        System.out.println(leet168.convertToTitle(1));
        System.out.println(leet168.convertToTitle(27));
        System.out.println(leet168.convertToTitle(28));
        System.out.println(28 / 26);
    }
}
