package main.java.并发同步.threads;

public class Thread1 {

    public void start() {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            System.out.println("------->开始睡眠");
            Thread.sleep(3000);
            System.out.println("------->结束睡眠");
            myThread.cancel();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class MyThread extends Thread{
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) { //while重复执行
                try {
                    System.out.println("test");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    //抛出InterruptedException后中断标志被清除，标准做法是再次调用interrupt恢复中断
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("stop");
        }

        public void cancel(){
            //对线程调用interrupt()方法，不会真正中断正在运行的线程，只是发出一个请求，由线程在合适时候结束自己。
            // 这个
            interrupt();
        }
    }

    public static void main(String arg[]){
       // 继承Thread类
//        Thread thread = new Thread(){
//            @Override
//            public void run() {
//                for(int i=0;i<10;i++){
//                    System.out.println("线程创建的第一种方式："+Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        thread.start();
//
//        //第二种创建线程的方式是实现Runnable接口 常见
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<10;i++){
//                    System.out.println("线程创建的第二种方式："+Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread2.start();
//
//        //在JDK1.5之后又给我们提供了一种新的创建线程的方式：实现Callable方法。
//        FutureTask<Integer> ft = new FutureTask<Integer>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                int i = 0;
//                for(;i<10;i++){
//                    System.out.println("线程创建的第三种方式："+Thread.currentThread().getName());
//                }
//                return i;
//            }
//        });
//        new Thread(ft).start();

        Thread1 interruptedExample = new Thread1();
        interruptedExample.start();
    }


}
