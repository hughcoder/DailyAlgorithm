package main.剑指offer.牛客第一轮错题;

import java.util.Stack;

public class JZ21 {
    //输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
    // 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
    // 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
    //12345 -> 45312  先存123、存4释放4，存5释放5

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            if (pushA[i] != popA[popIndex]) {
                stack.push(pushA[i]);
            } else {
                popIndex++;
            }
        }
        while (!stack.isEmpty() && popA[popIndex] == stack.peek()) {
            stack.pop();
            popIndex++;
            System.out.println("popIndex---->" + popIndex);
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        JZ21 jz21 = new JZ21();
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 3, 5, 1, 2};
        System.out.println(jz21.IsPopOrder(push, pop));
    }
}
