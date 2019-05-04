package main.java.内部类总结;

interface extendInnerClass{
    public int setAge();
}
//2.局部内部类
class Out2 {
    private int age = 12;

    private void privateOutPrint() {
        System.out.println("outPrint");
    }

    public void publicOutPrint() {
        System.out.println("public outPrint");
    }

    public extendInnerClass getInnerClass(){
        // 局部内部类
        //局部内部类是定义在一个方法或者一个作用域里面的类， 它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内 //方法和作用域内都有
        class innerClass implements extendInnerClass{
            public int setAge(){
                age++;
                publicOutPrint();
                privateOutPrint();
                return age;
            }
            //局部内部类不能使用静态方法
//            public static void method(){
//
//            }

        }
        return new innerClass();
    }
}

public class PartInnerClass {
    public static void main(String[] args) {
        Out2 out = new Out2();
        System.out.println(out.getInnerClass().setAge());
    }
}
