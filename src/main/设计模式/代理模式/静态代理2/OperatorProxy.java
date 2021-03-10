package main.设计模式.代理模式.静态代理2;

//操作者的代理类
public class OperatorProxy  implements Operate{
    private Operator operator;

    @Override
    public void doSomething() {
        if(operator == null)
            operator = new Operator();
        beforeDoSomething();
        operator.doSomething();
        afterDoSomething();
    }
    private void beforeDoSomething() {
        System.out.println("Before do something");
    }

    private void afterDoSomething() {
        System.out.println("After do something");
    }
}
