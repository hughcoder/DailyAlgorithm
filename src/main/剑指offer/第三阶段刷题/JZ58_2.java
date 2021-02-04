package main.剑指offer.第三阶段刷题;

public class JZ58_2 {
    //字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
    // 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

    public String reverseLeftWords(String s, int n) {
        String str1 = s.substring(0,n);
        String str2 = s.substring(n,s.length());
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str1);

        return sb.toString();
    }

    public static void main(String args[]) {
        JZ58_2 jz58 = new JZ58_2();
        System.out.println(jz58.reverseLeftWords("abcdefg",2));//"cdefgab"
        System.out.println(jz58.reverseLeftWords("lrloseumgh",6));//"umghlrlose"
    }
}
