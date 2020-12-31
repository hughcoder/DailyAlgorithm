package main.剑指offer.第三阶段刷题;

public class JZ44 {
    public int findNthDigit(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i);
        }
        String str = sb.toString();
        char a = str.charAt(n);

        return Integer.parseInt(String.valueOf(a));
    }

    public static void main(String args[]) {
        JZ44 jz44 = new JZ44();
        System.out.println(jz44.findNthDigit(10000000));
        System.out.println(jz44.findNthDigit(11));

    }
}
