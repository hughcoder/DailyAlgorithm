package main.java.并发同步.threads;

//Thread 与 Runnable 的区别？
public class ThreadRun implements Runnable {

    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票------->" + this.ticket--);
            }
        }
    }

    public static void main(String args[]) {
        ThreadRun threadRun = new ThreadRun();
        /** @param目标
         *当这个线程调用其{@code run}方法的对象
         *已启动。如果{@code null}，则调用此线程的run方法。
         *
         * @param名字
         *新线程的名称
         */
        new Thread(threadRun, "一号窗口").start(); //Runnable target, String name
        new Thread(threadRun, "二号窗口").start();
        new Thread(threadRun, "三号窗口").start();

    }
}
