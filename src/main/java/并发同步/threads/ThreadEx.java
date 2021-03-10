package main.java.并发同步.threads;

//Thread 与 Runnable 的区别？
public class ThreadEx extends Thread {
    private int ticket = 10;
    private String name;

    public ThreadEx(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i =0;i<20;i++){
            if(this.ticket >0){
                System.out.println(this.name + "卖票" +(this.ticket --));
            }
        }
    }

    public static void main(String args[]){
        ThreadEx ex1 = new ThreadEx("一号窗口");
        ThreadEx ex2 = new ThreadEx("二号窗口");
        ThreadEx ex3 = new ThreadEx("三号窗口");

        ex1.start();
        ex2.start();
        ex3.start();
    }
}
