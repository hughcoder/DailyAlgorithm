package main.设计模式.代理模式.静态代理2;

//具体化一个操作者
public class Operator implements Operate{
    @Override
    public void doSomething() {
        System.out.println("i'm doing something");
    }
}
