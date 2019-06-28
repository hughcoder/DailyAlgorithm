package main.java;

public class SuperClass {
    public void printA(){
        System.out.print("SuperClass-printA");
        printB();
    }
    public void printB(){
        System.out.print("SuperClass-printB");
    }
}


