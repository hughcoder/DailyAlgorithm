package main.threads.锁测试;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairAndUnfairTest {
    private static Lock fairLock = new ReentrantLock2(true);
    private static Lock unFairLock = new ReentrantLock2(false);

    public void fair() throws InterruptedException {
        testLock("公平锁", fairLock);
    }

    public void unFair() throws InterruptedException {
        testLock("非公平锁", unFairLock);
    }

    private void testLock(String type, Lock lock) throws InterruptedException {
        //启动5个线程
        System.out.println(type);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Job(lock)) {
                @Override
                public String toString() {
                    return getName();
                }
            };
            thread.setName("" + i);
            thread.start();
        }
        Thread.sleep(11000);

    }

    private static class Job extends Thread {
        private Lock lock;

        public Job(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            for (int i = 0; i < 2; i++) {
                lock.lock();
                try{
                    Thread.sleep(1000);
                    System.out.println("获取锁的当前线程[" + Thread.currentThread().getName() + "], 同步队列中的线程" + ((ReentrantLock2)lock).getQueueThreads() + "");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    private static class ReentrantLock2 extends ReentrantLock {
        public ReentrantLock2(boolean fair) {
            super(fair);
        }

        public Collection<Thread> getQueueThreads() {
            List<Thread> arrayList = new ArrayList<Thread>(super.getQueuedThreads());
            Collections.reverse(arrayList);
            return arrayList;
        }


    }

    public static void main(String[] args) throws InterruptedException {
        FairAndUnfairTest test = new FairAndUnfairTest();
        test.fair();
        test.unFair();
    }

}
