package main.java.反射.constructor;

import main.java.反射.UserInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefConstructorDemo {

    //创建对象有两种方法：
    //java.lang.reflect.Constructor.newInstance()
    //Class.newInstance()
    public static void main(String agrs[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class clazz = UserInfo.class;
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        UserInfo userInfo = (UserInfo) constructor.newInstance("haha", 3);
        System.out.println(userInfo.toString());
    }
}
