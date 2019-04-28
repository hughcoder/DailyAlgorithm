package main.java基础.子父类相关;

public class Fu {
    //问题一： 静态属性和静态方法是否可以被继承？是否可以被重写？以及原因？ 可以继承 但不能重写
    //问题二：父类的静态方法能否被子类重写 ？ 不能
    public static String one_1 = "one";
    public static void oneFn() {
        System.out.println("oneFn");
    }

    public static void show() {
        System.out.println("父类的静态方法");
    }
    public void method() {
        System.out.println("父类的普通方法");
    }
}

