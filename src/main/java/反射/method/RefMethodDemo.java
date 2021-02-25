package main.java.反射.method;

import main.java.反射.UserInfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class RefMethodDemo {

    //Class 依然提供了四种方法获取 Method：
    //getDeclaredMethod(String name, Class<?>... parameterTypes)
    //getMethod(Sting name, Class<?>... parameterTypes)
    //getDeclaredMethods()
    //getMethods()

    public static void main(String agrs[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        UserInfo userInfo = new UserInfo("aaa",99);
        Class clazz = userInfo.getClass();
        Method nameMethod = clazz.getMethod("setName",String.class);
        Parameter[] parameters = nameMethod.getParameters();
        if(parameters.length>0){
            for(Parameter p : parameters){
                StringBuilder sb = new StringBuilder();
                sb.append("参数类型: ");
                sb.append(p.getType());
                sb.append("参数名称: ");
                sb.append(p.getName());
                System.out.println(sb.toString());
            }
        }
        nameMethod.invoke(userInfo,"hahaha");
        System.out.println(userInfo.toString());

    }
}
