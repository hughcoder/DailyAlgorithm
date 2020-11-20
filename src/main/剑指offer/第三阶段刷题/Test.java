package main.剑指offer.第三阶段刷题;

public class Test {

    private int getRealIndex(int num) {
        int sum = 0;
        while (num >= 9) {
            if(num % 10 !=0){
                sum += num / 10;
                num = num / 10;
            }else {
                num = num / 10;
            }
        }
        return sum + num;
    }

    public static void main(String args[]) {
        Test test = new Test();
        System.out.println(test.getRealIndex(30));
        System.out.println(test.getRealIndex(11));
        System.out.println(test.getRealIndex(22));
    }
}
