package main.java基础.内部类总结;
// 4.匿名内部类

interface anonymous{
    public void getAnonymousAge();
    public void print();
}
//匿名内部类是唯一一种没有构造器的类。正因为其没有构造器，
// 所以匿名内部类的使用范围非常有限，大部分匿名内部类用于接口回调。！！！

class Out4 {
    private static int age = 12;

    public anonymous getAnonymous(){
        return new anonymous(){

            @Override
            public void getAnonymousAge() {
                System.out.println(age);
            }

            @Override
            public void print() {
                System.out.println("22222");
            }
        };
    }
}

public class anonymousInnerClass {

    public static void main(String[] args) {
        Out4 out = new Out4();
        out.getAnonymous().getAnonymousAge();
        out.getAnonymous().print();
        out.getAnonymous();
    }

}