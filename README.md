# 记录了一些写过的算法题 和对java基础知识点的查漏补缺

## java相关

### 1. 静态属性和静态方法是否可以被继承？是否可以被重写？以及原因？

### 2.什么是内部类 内部类、静态内部类、局部内部类和匿名内部类的区别及作用

* 内部类的作用
⑴ 内部类作为外部类的成员，可以访问外部类的私有成员或属性。（即使将外部类声明为PRIVATE，但是对于处于其内部的内部类还是可见的。） 
⑵ 用内部类定义在外部类中不可访问的属性。这样就在外部类中实现了比外部类的private还要小的访问权限。

* 局部内部类的作用 ----没理解。
在类外不可直接生成局部内部类（保证局部内部类对外是不可见的）。
要想使用局部内部类时需要生成对象，对象调用方法，在方法中才能调用其局部内部类。
通过内部类和接口达到一个强制的弱耦合，用局部内部类来实现接口，并在方法中返回接口类型，使局部内部类不可见，
屏蔽实现类的可见性。

* 静态内部类
生成（new）一个静态内部类不需要外部类成员：这是静态内部类和成员内部类的区别。静态内部类的对象可以直接生成： 
Outer.Inner in=new Outer.Inner()； 
而不需要通过生成外部类对象来生成。这样实际上使静态内部类成为了一个顶级类。静态内部类不可用private来进行定义。

* 匿名内部类
实现接口

### 3. == 和 equals() 和 hashcode()的区别？
== 基本类型比较值     复合类型比较的是堆内存的地址 (String != Stringbuffer) //这里String a = String b 这部分看下

equals 默认实现是 == 一些类都会覆写

hashCode ： Object 的 native方法 , 获取对象的哈希值，用于确定该对象在哈希表中的索引位置，它实际上是一个int型整数
！！ 这边最好能引申到栈内存和堆内存  //看下jvm

### 4.java的集合以及集合之间的继承关系

-----Collection
* List 有序可重复   （ArrayList 可以用来查改  LinkedList 可以用来增删） ArrayList是实现了基于动态数组的数据结构，而LinkedList是基于链表的数据结构
* Set  无序不重复  （HashSet:无序   TreeSet:需要排序）
-----Map
* Map  映射关系     (HashMap:无序  TreeMap:排序)

Collection和Map最大的区别就是Collection存储的是一组对象；Map是以“键值对”的形式对对象进行的管理

--List

* ArrayList
1.可变大小
2.非线程安全
3.动态增长

* LinkedList
1.是一个双链表
2.非线程安全


### 5.HashMap HashTable ConcurrentHashMap区别
HashMap  HashMap由数组+链表组成的，数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的，线程不安全
1.本质数组+链表
2.hash值put 、 扩容
3.Fail-Fast机制 防止其他线程操作
Hashtable 是jdk1的一个遗弃的类，它把所有方法都加上synchronized关键字来实现线程安全。所有的方法都同步这样造成多个线程访问效率特别低
1.将hashMap锁住
ConcurrentHashMap :Segment数组的意义就是将一个大的table分割成多个小的table来进行加锁，也就是上面的提到的锁分离技术，而每一个Segment元素存储的是HashEntry数组+链表，这个和HashMap的数据存储结构一样
2.分块加锁

理解HashMap 的put get源码
一、 put
* 判断 value 是否为空，为空则抛出异常；
* 计算 key 的 hash 值，并根据 hash 值获得 key 在 table 数组中的位置 index，如果 table[index] 元素不为空，则进行迭代，如果遇到相同的 key，则直接替换，并返回旧 value；
* 否则，我们可以将其插入到 table[index] 位置。
二、 get
*首先通过 hash()方法求得 key 的哈希值，
*然后根据 hash 值得到 index 索引（上述两步所用的算法与 put 方法都相同）。
*然后迭代链表，返回匹配的 key 的对应的 value；找不到则返回 null。

