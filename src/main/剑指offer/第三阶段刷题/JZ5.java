package main.剑指offer.第三阶段刷题;

import main.剑指offer.牛客第一轮错题Re.JZ6;

public class JZ5 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        JZ5 jz5 = new JZ5();
       String s = "We are happy.";
        System.out.println(jz5.replaceSpace(s));

    }
}
