package main.设计模式.代理模式.动态代理;

import main.设计模式.代理模式.静态代理2.Operate;

public class Operator2 implements Operate {
    @Override
    public void doSomething() {
        System.out.println("Operator2 doing something");
    }

    @Override
    public void sleep() {
        System.out.println("i not sleep hhhh");
    }
}
