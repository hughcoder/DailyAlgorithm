package main.java.反射;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReflectMapDemo {

    public static void main(String agrs[])throws Exception{
        Class c = HashMap.class;
        //获取类名
        String className = c.getName();
        System.out.println("类名: " + className);
        //获取类限定符 public
        String modifier = Modifier.toString(c.getModifiers());
        System.out.println("类限定符: " + modifier);

        //获取类泛型参数
        TypeVariable[] typeParameters = c.getTypeParameters();
        if(typeParameters.length>0){
            StringBuilder sb = new StringBuilder("泛型参数：");
            for (TypeVariable typeVariable : typeParameters) {
                sb.append(typeVariable.getName());
                sb.append("___");
            }
            System.out.println(sb.toString());
        }else {
            System.out.println("类泛型参数为空！");
        }
        //获取类所实现的接口
        Type[] interfaces = c.getGenericInterfaces();
        if(interfaces.length>0){
            StringBuilder sb = new StringBuilder("接口信息：");
            for (Type type : interfaces) {
                sb.append(type.toString());
                sb.append("___");
            }
            System.out.println(sb.toString());
        }else {
            System.out.println("类接口信息为空！");
        }

        //获取继承的父类信息
        List<Class> superClazzs = new ArrayList<>();

        //获取类注解信息
        Annotation[] annotations = c.getAnnotations();
        if (annotations.length != 0) {
            StringBuilder sb = new StringBuilder("类注解信息：");
            for (Annotation annotation : annotations) {
                sb.append(annotation.toString());
                sb.append("___");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("类注解信息为空！");
        }
    }
}
