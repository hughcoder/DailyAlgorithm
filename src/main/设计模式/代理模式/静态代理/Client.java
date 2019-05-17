package main.设计模式.代理模式.静态代理;

public class Client {
    public static void main(String args[]) {
      ILawsuit xiaomin = new XiaoMing();
      ILawsuit lawyer = new Lawyer(xiaomin);

      lawyer.submit();
      lawyer.burden();
      lawyer.defend();
      lawyer.finish();
    }
}
