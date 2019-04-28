package main.java基础.内部类总结;

//1.成员内部类
//最普通的内部类，它定义在另一个类的内部，

//外部类
class Out {
    private int age = 12;

    public static  int ccc =1111;

    private void privateOutPrint() {
        System.out.println("outPrint");
    }

    public void publicOutPrint() {
        System.out.println("public outPrint");
    }

    //内部类     成员内部可以调用外部类的 私有公有方法 以及静态方法
    class In {

        public  int inAge =13;
        private int priInAge =14;
        public void print() {
            System.out.println(age);
            System.out.println(ccc);  
            publicOutPrint();
            privateOutPrint();
        }

//        public static void method(){
//
//        }
    }
}

public class NormalInnerClass {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();




        //或者采用下种方式访问

        Out out = new Out();
        // out.privateOutPrint();         类私有

        Out.In in22 = out.new In();
//        in22.print();

    }
}
