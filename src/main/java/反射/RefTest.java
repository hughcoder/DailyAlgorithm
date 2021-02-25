package main.java.反射;

import java.lang.reflect.Field;

public class RefTest {
    public static void main(String[] args) throws Exception {
        UserInfo userInfo = new UserInfo("Omooo", 18);
        System.out.println("Before: " + userInfo.toString());
        Class clazz = userInfo.getClass();
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        Field ageField = clazz.getField("age");
        nameField.set(userInfo, "Tom");
        ageField.setInt(userInfo, 19);


        //获取或者修改 不可修改（final）的变量
        Field wannaPlayGame = clazz.getField("wannaPlayGame");
        wannaPlayGame.setAccessible(true);
        wannaPlayGame.setBoolean(userInfo, false);

        System.out.println(wannaPlayGame);
        System.out.println("After: " + userInfo.toString());
    }
}
