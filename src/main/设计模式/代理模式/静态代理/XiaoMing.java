package main.设计模式.代理模式.静态代理;

public class XiaoMing implements ILawsuit{

    @Override
    public void submit() {
        System.out.println("老板拖欠工资");
    }

    @Override
    public void burden() {
        System.out.println("证据");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功");
    }
}
