package main.java.集合类相关;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class ListTest {
    public static void main(String args[]){
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // ArrayList是实现了基于动态数组的数据结构，而LinkedList是基于链表的数据结构；


//     Hashtable是线程安全的，它的方法是同步了的，可以直接用在多线程环境中。
//     而HashMap则不是线程安全的。在多线程环境中，需要手动实现同步机制。
        HashMap hashMap = new HashMap();
        Hashtable hashtable = new Hashtable();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }
}
