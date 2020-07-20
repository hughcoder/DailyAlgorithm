package main.Leetcode.day1;

import main.Leetcode.Testd;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//
// 想到用栈就行了

public class Leet20 {
    public static boolean isValid(String s) {

        Stack<String> stack = new Stack<>();
        List<String> left = new ArrayList<>();
        left.add("(");
        left.add("{");
        left.add("[");
        List<String> right = new ArrayList<>();
        right.add(")");
        right.add("}");
        right.add("]");

        for (int i = 0; i < s.length(); i++) {
            char temp1 = s.charAt(i);
            String str1 = String.valueOf(temp1);
            if (isContains(str1, left)) {
                stack.push(str1);
            } else if (isContains(str1, right)) {
                if (!stack.isEmpty()) {
                    if (isSuccess(stack.pop(),str1)) {
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
    }

    private static boolean isSuccess(String s, String s2) {
//        System.out.println("s---->"+s);
//        System.out.printf("s2----->"+s2);
       if(s.equals("(")&&s2.equals(")")){
           return true;
       }
        if(s.equals("[")&&s2.equals("]")){
            return true;
        }
        if(s.equals("{")&&s2.equals("}")){
            return true;
        }

       return false;
    }

    private static boolean isContains(String s, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (s.equals(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("{[]}"));
    }
}
