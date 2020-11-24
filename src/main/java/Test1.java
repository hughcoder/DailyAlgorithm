package main.java;

import java.lang.reflect.Method;

public class Test1 {
    public void hello() {
        System.out.println("当前类由" + getClass().getClassLoader().getClass()
                + " 加载");
    }
    public static void main(String args[]) throws Exception {
        Test1 t1 = new Test1();
        t1.hello();

        CustomClassLoader customClassLoader = new CustomClassLoader("./Download");
        Class clazz = customClassLoader.loadClass("main.java.Test1");
        Object obj = clazz.newInstance();
        Method helloMethod = clazz.getDeclaredMethod("hello", null);
        helloMethod.invoke(obj, null);

    }
}
