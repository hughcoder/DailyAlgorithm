package main.java;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

public class CustomClassLoader extends ClassLoader {

    private String classPath;

    public CustomClassLoader(String classPath) {
        this.classPath = classPath;
    }

    private byte[] loadByte(String name) throws Exception {
        name = name.replaceAll("\\.", "/");
        FileInputStream fis = new FileInputStream(classPath + "/" + name + ".class");
        int len = fis.available();
        byte[] data = new byte[len];
        fis.read(data);
        fis.close();
        return data;
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] data = loadByte(name);
            return defineClass(name, data, 0, data.length);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ClassNotFoundException();
        }
    }

    public static void main(String args[]) throws Exception {
        File directory = new File("");//设定为当前文件夹
        System.out.println(System.getProperty("java.version"));
        try {
            System.out.println(directory.getAbsolutePath());//获取绝对路径
        } catch (Exception e) {
        }
        System.out.println("---->"+directory.getAbsolutePath()+"/src");
        //要用自定义的classloader 需要将原先的Test1.java删除
        CustomClassLoader customClassLoader = new CustomClassLoader(directory.getAbsolutePath()+"/src");
        Class clazz = customClassLoader.loadClass("main.java.Test1");
        Object obj = clazz.newInstance();
        Method helloMethod = clazz.getDeclaredMethod("hello", null);
        helloMethod.invoke(obj, null);

    }
}
