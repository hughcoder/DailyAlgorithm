package main.threads.同步相关;

public class AccountingSyncBad implements Runnable {
    static int i = 0;

    public synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        // 如果我们用synchronized 修饰方法，这时候多线程要同步，我们需要确保是同一对象
        Thread t1 = new Thread(new AccountingSyncBad());
        Thread t2 = new Thread(new AccountingSyncBad());

        t1.start();
        t2.start();
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
