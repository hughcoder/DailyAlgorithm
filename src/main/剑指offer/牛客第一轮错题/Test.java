package main.剑指offer.牛客第一轮错题;

public class Test {
    public static void main(String args[]) {
//        System.out.println(addSum(15));
//        System.out.println(addSum(8));
//        System.out.println(addSum(100));
//
//        System.out.println('1');
//        String str = "1";
//        System.out.println(str.charAt(0));
        System.out.println('e' > '1');
        System.out.println('e' < '9');
        int a = 5;
        System.out.println(a |= 4);

        boolean flag = true;
        flag = true;
        flag |= true;
        System.out.println("true\t|=\ttrue\t==>\t" + flag);
        flag = true;
        flag |= false;
        System.out.println("true\t|=\tfalse\t==>\t" + flag);
        flag = false;
        flag |= true;
        System.out.println("false\t|=\ttrue\t==>\t" + flag);
        flag = false;
        flag |= false;
        System.out.println("false\t|=\tfalse\t==>\t" + flag + "\n");


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
