package main.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Thread1 {
    public static void main(String arg[]){
       // 继承Thread类
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("线程创建的第一种方式："+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

        //第二种创建线程的方式是实现Runnable接口 常见
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("线程创建的第二种方式："+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();

        //在JDK1.5之后又给我们提供了一种新的创建线程的方式：实现Callable方法。
        FutureTask<Integer> ft = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int i = 0;
                for(;i<10;i++){
                    System.out.println("线程创建的第三种方式："+Thread.currentThread().getName());
                }
                return i;
            }
        });
        new Thread(ft).start();
    }
}
