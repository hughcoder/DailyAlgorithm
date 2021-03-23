package main.剑指offer.面试遇到的;

public class Leet504 {
    public String convertToBase7(int num) {
        if(num ==0){
            return "0";
        }
        boolean isfushu = num<0;
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (n!=0){
            sb.append(n%7);
            n = n/7;
        }
        if(isfushu){
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    public static void main(String args[]) {
        Leet504 leet504 = new Leet504();

        System.out.println(leet504.convertToBase7(100));
        System.out.println(leet504.convertToBase7(-7));
    }
}
