package main.java.并发同步.threads;

public class Synchorized {
    public static void main(String[] args){
        synchronized (Synchorized.class){

        }
        m();
    }
    public static synchronized void m(){

    }
}
