package main.java.内部类总结;
//静态内部类
//可以看到，如果用static 将内部内静态化，那么内部类就只能访问外部类的静态成员变量，具有局限性
//
//其次，因为内部类被静态化，因此Out.In可以当做一个整体看，可以直接new 出内部类的对象（通过类名访问static，生不生成外部类对象都没关系）

class Out3 {

    private int aaa = 3;
    private static int age = 12;

    static class In {
        public void print() {
            System.out.println(age);
       //     System.out.println(aaa); //静态内部类只能调用外部类的静态变量
        }
    }
}

public class staticInnerClass {
    public static void main(String[] args) {
        Out3.In in = new Out3.In();
        in.print();
    }
}