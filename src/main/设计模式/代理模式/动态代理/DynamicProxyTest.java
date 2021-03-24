package main.设计模式.代理模式.动态代理;

import main.设计模式.代理模式.静态代理2.Operate;
import main.设计模式.代理模式.静态代理2.Operator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//可以看到，动态代理是利用反射实现的，而且只能代理接口方法，对于非接口方法表示无能为力。
public class DynamicProxyTest {
    public static void main(String[] args) {
        Operate operate = new Operator();
        InvocationHandler invocationHandler = new InvocationHandlerImpl(operate);
        Operate operateProxy = (Operate) Proxy.newProxyInstance(operate.getClass().getClassLoader(),
                operate.getClass().getInterfaces(), invocationHandler);
        operateProxy.doSomething();
//        operateProxy.sleep();

        Operator2 operator2 = new Operator2();
        InvocationHandler invocationHandler2 = new InvocationHandlerImpl(operator2);
        Operate operateProxy22 = (Operate) Proxy.newProxyInstance(operator2.getClass().getClassLoader(), operator2.getClass().getInterfaces(), invocationHandler2);
//        operateProxy22.doSomething();
//        operateProxy22.sleep();
    }

    //既然动态代理是通过运行时生成类来实现的，那么还有没有别的方式运行时动态生成类呢
    //Javassist
    //CGLib
}
