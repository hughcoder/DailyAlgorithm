package main.java.app;

import java.lang.reflect.Field;

public class FiledA {
    int field = 3;
    static int staticField = 4;
    private static FiledA sFiledA;


    private FiledA getFiledA(){
        if(sFiledA == null){
            sFiledA = new FiledA();
            return sFiledA;
        }
        return sFiledA;
    }
}
