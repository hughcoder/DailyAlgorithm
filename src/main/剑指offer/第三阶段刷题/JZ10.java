package main.剑指offer.第三阶段刷题;

public class JZ10 {

    public int fib(int n) {

        if(n<=1){
            return n;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
}
