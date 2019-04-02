package main.栈相关;

import java.util.Stack;

//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
// 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

// 思路：先自行总结出栈入栈规律 先理解12345 如何通过一个栈弹出45321
// 分类
//1。 如果下一个弹出的数字刚好是栈顶，那么直接弹出
// 2。如果下一个弹出的数子不在栈顶，则继续压入
public class Stack1 {

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        if(pushA.length == 0 || popA.length == 0)
            return false;
        int popindex =0; //这边是记录pop的下标

        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]); //首先先将该数字压入栈中
            System.out.println("pushA[推入的数字]"+pushA[i]);
            System.out.println("popA对应的数字"+popA[popindex]);
            while(!stack.isEmpty()&&stack.peek()==popA[popindex] ){  //peek查询对应的栈顶元素 一致的话弹出，pop与stack都向后一位
                System.out.println("popA[popindex]----->"+popA[popindex]);
                stack.pop();
                popindex++;
            }
        }

        return stack.isEmpty(); // 如果为空则全部推出，如果不为空 则数字对应不上
    }

    public static void main(String arg[]){
        int[] push = {1,2,3,4,5};
        int[] pop = {4,5,3,2,1};
        boolean a =IsPopOrder(push,pop);
        System.out.println(a);
    }
}
