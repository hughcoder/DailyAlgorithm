package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ58 {
//输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，
// 标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
    //输入: "the sky is blue"
    //输出: "blue is sky the"

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = strs.length-1; i >= 0; i--) {
            if(strs[i].equals("")) continue;
            sb.append(strs[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }





    public static void main(String args[]) {
        JZ58 jz58 = new JZ58();
        System.out.println(jz58.reverseWords("I am a student. "));
        System.out.println(jz58.reverseWords("the sky is blue"));

    }
}
