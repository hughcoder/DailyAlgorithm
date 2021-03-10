package main.java.并发同步;

public class VolatileDemo {
    private volatile int start = 0;

    private void Keyword() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    start++;
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }


    public static void main(String args[]) throws Exception {
        VolatileDemo volatileDemo = new VolatileDemo();
        volatileDemo.Keyword();
        System.out.println("start----->" + volatileDemo.start);
    }
}
