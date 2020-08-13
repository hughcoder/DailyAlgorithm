package main.剑指offer第一轮刷题;

import java.util.ArrayList;

//小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,
// 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
// 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

//想到滑动窗口就不难
public class JZ41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> allList = new ArrayList<>();


        for (int i = 1; i < sum / 2 +1; i++) { //第一个指针
            ArrayList<Integer> singleList = new ArrayList<>();
            singleList.add(i);
            for (int j = i + 1; j < sum; j++) {
                singleList.add(j);
                if (getSum(singleList) < sum) {

                } else if (getSum(singleList) == sum) {
                    allList.add(new ArrayList<>(singleList));
                    break;
                } else {
                    break;
                }
            }
        }
        return allList;
    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        JZ41 jz41 = new JZ41();
        ArrayList<ArrayList<Integer>> lists = jz41.FindContinuousSequence(9);
        System.out.println(lists.toString());
    }
}
