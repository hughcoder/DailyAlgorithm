package main.java.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldTest {

    public static void main(String args[]) throws Exception {
       Field field = FiledA.class.getDeclaredField("field");
       //在java的反射中,通过字段获取对象,是通过  get
       int a = (Integer)field.get(new FiledA());
        System.out.println(a);
        Field staticfield=FiledA.class.getDeclaredField("staticField");
        int b= (Integer)staticfield.get("") ;
        int d= (Integer)staticfield.get(null) ;
        System.out.println(b);
        System.out.println(d);
//
//        Class<?> FieldAClass = Class.forName("main.java.app.FiledA");
//        Method currentMethod = FieldAClass.getDeclaredMethod("getFiledA");
//        currentMethod.setAccessible(true);
//        Object filedAObject = currentMethod.invoke(null);
//
//        Field field1 = FieldAClass.getDeclaredField("field");
//        field1.setAccessible(true);
//        int ccc = (int) field1.get(filedAObject);
//        System.out.println("----->cc"+ccc);

    }


}
