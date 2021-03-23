package main.剑指offer.专项分类练习.数学;

public class Leet507 {
    //输入: 100
    //输出: "202"
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean isFlag = num>0;//是否是正数
        StringBuilder sb = new StringBuilder();
        int n = Math.abs(num);
        while (n != 0) {
            sb.append(n % 7);
            n = n / 7;
        }
        if(!isFlag){
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    public static void main(String args[]) {
        Leet507 leet507 = new Leet507();
        System.out.println(leet507.convertToBase7(100));
        System.out.println(leet507.convertToBase7(-7));
    }
}
