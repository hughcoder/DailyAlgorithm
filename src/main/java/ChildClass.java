package main.java;

public class ChildClass extends SuperClass {

    @Override
    public void printA() {
        System.out.println("------child print A");
        super.printA();
    }

    @Override
    public void printB() {
        System.out.println("------child print B");
    }

    public static void main(String args[]){
//        ChildClass childClass = new ChildClass();
//        childClass.printA();

        SuperClass child11 = new SuperClass();
        child11.printA();
    }
}
