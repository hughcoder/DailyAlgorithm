package main.java.反射.field;

import main.java.反射.UserInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;

//反射变量调试

public class RefFieldDemo {
    //这种动态获取信息以及动态调用对象的方法的功能成为 Java 语言的反射机制。
    public static void main(String agrs[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class c = UserInfo.class;
        Constructor constructor = c.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        UserInfo userInfo = (UserInfo) constructor.newInstance("aaaa", 18);
        System.out.println(userInfo.toString());

        //Feild 变量反射相关尝试
        Class clazz = UserInfo.class;
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            for (Field field : fields) {
                StringBuilder sb = new StringBuilder();
                //变量名
                String name = field.getName();
                sb.append("变量名:");
                sb.append(name);

                //变量类型
                String type = field.getType().getName();
                sb.append("变量类型:");
                sb.append(type);

                //变量修饰符
                String modifier = Modifier.toString(field.getModifiers());
                sb.append("变量修饰符: ");
                sb.append(modifier);

                //变量上的注解
                Annotation[] annotations = field.getDeclaredAnnotations();
                if (annotations.length > 0) {
                    for (Annotation annotation : annotations) {
                        String annName = annotation.toString();
                        sb.append("注解： ");
                        sb.append(annName);
                    }
                }
                System.out.println(sb);
            }
        }

        //获取、设置变量值

        UserInfo xiaoming = new UserInfo("xiaoming", 18);
        UserInfo xiaok = new UserInfo("xiaok", 66);
        System.out.println("before:" + xiaoming.toString());
        Class clacc = xiaoming.getClass();
        Field nameField = clacc.getDeclaredField("name");
        nameField.setAccessible(true);
        Field ageField = clacc.getField("age");
//        ageField.setAccessible(true);
        nameField.set(xiaoming, "Tom");
        ageField.set(xiaoming,30);
        ageField.set(xiaok,99);
        System.out.println("After:" + xiaoming.toString());
    }
}
