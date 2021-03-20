package main.java.原子类操作;

import java.util.concurrent.atomic.AtomicLong;

public class Message {
    private static AtomicLong count = new AtomicLong();

    public Long getMsgId(){
        return count.getAndDecrement();
    }
}
