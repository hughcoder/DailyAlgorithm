package main.设计模式.代理模式.静态代理2;

public class StaticProxyTest {
    public static void main(String[] args) {
        OperatorProxy proxy = new OperatorProxy();
        proxy.doSomething();
    }
}
