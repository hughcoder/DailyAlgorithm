package main.threads;

import java.util.concurrent.*;

public class InterruptByFuture {

    public  static void main(String args[])throws Exception{
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<?> task = es.submit(new MyThread());

        try{
            //限定时间获取结果
            task.get(5, TimeUnit.SECONDS);
        }catch (TimeoutException e){
            //超时触发线程中止
            System.out.println("thread over time");
        }finally {
            boolean mayInterruptIfRunning = true;
            task.cancel(mayInterruptIfRunning);
            //cancel()有个参数mayInterruptIfRunning，表示任务是否能够接收到中断。
            //
            //mayInterruptIfRunning=true时，任务如果在某个线程中运行，那么这个线程能够被中断；
            //mayInterruptIfRunning=false时，任务如果还未启动，就不要运行它，应用于不处理中断的任务
        }
    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("count");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("thread stop");
        }

        public void cancel() {
            interrupt();
        }
    }
}
