package main.剑指offer第一轮错题;

public class Test {
    public static void main(String args[]) {
//        System.out.println(addSum(15));
//        System.out.println(addSum(8));
//        System.out.println(addSum(100));
//
//        System.out.println('1');
//        String str = "1";
//        System.out.println(str.charAt(0));
        System.out.println('e'>'1');
        System.out.println('e'<'9');
    }

    private static int addSum(int num) {
        int sum = 0;
        while (num / 10 != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum + num;
    }
}
