package main.java基础.子父类相关;

public class Zi extends Fu {
    //在编译时所分配的内存会一直存在（不会被回收），直到程序退出内存才会释放这个空间，
    // 在实例化之前这个方法就已经存在于内存，跟类的对象没什么关系。子类中如果定义了相同名称的静态方法，
    // 并不会重写，而应该是在内存中又分配了一块给子类的静态方法，没有重写这一说，只是单纯的名字重复了。
    public static void main(String[] args) {
//        Zi zi = new Zi();
//        zi.oneFn();
//        System.out.println(zi.one_1);
//        zi.show();
//        zi.method();
        Fu fu = new Zi();
        fu.show();
        fu.method();
        System.out.println(fu.one_1);
        fu.oneFn();
    }

    public static String one_1 = "two";

    public static void oneFn() {
        System.out.println("TwoFn");
    }


    public static void show() {
        System.out.println("子类的静态");
    }

    public void method() {
        System.out.println("子类的普通方法");
    }

}
