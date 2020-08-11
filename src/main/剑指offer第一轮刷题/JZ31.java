package main.剑指offer第一轮刷题;

public class JZ31 {
    //求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
    // 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。

    public int NumberOf1Between1AndN_Solution(int n) {

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<=n;i++){
            builder.append(i);
        }
        String str = builder.toString();
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        JZ31 jz30 = new JZ31();

        System.out.println(jz30.NumberOf1Between1AndN_Solution(13));
    }
}
