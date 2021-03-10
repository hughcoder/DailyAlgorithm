package main.java.并发同步.线程池;

import main.java.并发同步.VolatileDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static class MyTask implements Runnable {
        private int taskName;

        public MyTask(int taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println("正在执行 Task: " + taskName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task:" + taskName + "执行完毕");
        }
    }
    //当线程池中的线程数大于五时，便会将后续任务添加到任务等待队列中，当任务等待队列也满了之后，便会创建新的线程。
    public static void main(String args[]) throws Exception {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        for (int i = 0; i < 15; i++) {
            MyTask task = new MyTask(i);
            executor.execute(task);
            System.out.println("线程池中线程数目: " + executor.getPoolSize() + " 队列中等待执行的任务数: "
                    + executor.getQueue().size() + " 已执行完的任务数: " + executor.getCompletedTaskCount());
        }
        executor.shutdown();

    }
}
