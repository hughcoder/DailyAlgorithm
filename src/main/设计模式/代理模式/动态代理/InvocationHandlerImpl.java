package main.设计模式.代理模式.动态代理;

import main.设计模式.代理模式.静态代理2.Operate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//我们在使用RPC框架的时候，框架本身并不能提前知道各个业务方要调用哪些接口的哪些方法
// 。那么这个时候，就可用通过动态代理的方式来建立一个中间人给客户端使用，也方便框架进行搭建逻辑，某种程度上也是客户端代码和框架松耦合的一种表现。
public class InvocationHandlerImpl implements InvocationHandler {

    private Operate operate;

    public InvocationHandlerImpl(Operate operate){
        this.operate = operate;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Before call");
        method.invoke(operate,objects);
        System.out.println("After call");
        return null;
    }
}
