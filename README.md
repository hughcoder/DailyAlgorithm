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


### 6.对反射的了解
Java 强类型语言，但是我们在运行时有了解、修改信息的需求，包括类信息、成员信息以及数组信息。
！！！ 反射的原理
！！！ 为什么反射消耗性能:  创建好多临时变量，造成gc回收，内存抖动 递归的查找方法也是消耗性能

### 得到一个 Class 对象
以下是几种获取Class对象的方法
* 1.Object.getClass 方法
```java
Class c = "com.hugh".getClass();

```

* 2.在要获得的类名后加上 .class ，比如这样：
```java
Integer.class.newInstance();
int.class.newInstance()

//可以看到，这种方式不仅能用于引用类型，基本类型也可以。
 // 当然数组也可以：x`
 Class b = int[][].class;
```

* 3.Class.forName()
如果我们有一个类的完整路径，就可以使用 Class.forName(“类完整的路径”) 来得到相应的 Class，这个方法只能用于引用类型，比如：

```java
Class<?> c = Class.forName("java.lang.String");
Class<?> aClass = Class.forName("com.hugh.demo1.beans.BookBean"); //包名加路径


//  具体参考这个类MethodTypeSpy
```

！！！ 有时间了解下反射的原理 运行时



### 7.对注解的了解？
为程序的元素（类、方法、成员变量）加上更直观的说明，`这些说明信息是与程序的业务逻辑无关，并且供指定的工具或框架使用。`Annontation像一种修饰符一样，应用于包、类型、构造方法、方法、成员变量、参数及本地变量的声明语句中。 
Java 注解是附加在代码中的一些元信息，用于一些工具在编译、运行时进行解析和使用，起到说明、配置的功能。`注解不会也不能影响代码的实际逻辑，仅仅起到辅助性的作用。`


* 1.能够读懂别人写的代码（尤其是框架相关的代码）；
* 2.实现替代配置文件的功能。比如可能原本需要很多配置文件以及很多逻辑才能实现的内容，如果使用合理的注解，就可以使用一个或多个注解来实现相同的功能。这样就使得代码更加清晰和整洁；
* 3.编译时进行格式检查。 如 @Override 注解放在方法前，如果该方法不是覆盖了某个超类方法，编译的时候编译器就能检查出来。


### 元注解
元注解
元注解是可以注解到注解上的注解，或者说元注解是一种基本注解，但是它能够应用到其它的注解上面。或者可以理解为：元注解也是一张标签，但是它是一张特殊的标签，它的作用和目的就是给其他普通的标签进行解释说明的。

基本的元标签有 @Retention, @Documented, @Target, @Inherited 四种（后来到了 Java 8 又加入了 @Repeatable）。

  ---------------------
  @Retention
  @Retention 定义了该注解的生命周期。当 @Retention 应用到一个注解上的时候，作用就是说明这个注解的存活时间。
 
  RetentionPolicy.SOURCE: 注解只在源码阶段保留，在编译器完整编译之后，它将被丢弃忽视；
  例：@Override, @SuppressWarnings
  RetentionPolicy.CLASS: 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中；
  RetentionPolicy.RUNTIME: 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们；笔者接触到大部分的注解都是 RUNTIME 的生命周期。
 
  ---------------------
  @Target 表示该注解用于什么地方，可以理解为：当一个注解被 @Target 注解时，这个注解就被限定了运用的场景。可以使用的 ElementType 参数：
 
  ElementType.CONSTRUCTOR: 对构造方法进行注解；
  ElementType.ANNOTATION_TYPE: 对注解进行注解；
  ElementType.FIELD: 对属性、成员变量、成员对象（包括 enum 实例）进行注解；
  ElementType.LOCAL_VARIABLE: 对局部变量进行注解；
  ElementType.METHOD: 对方法进行注解；
  ElementType.PACKAGE: 对包进行注解；
  ElementType.PARAMETER: 对描述参数进行注解；
  ElementType.TYPE: 对类、接口、枚举进行注解；
  
  ---------------------
 @Documented 是一个简单的标记注解，表示是否将注解信息添加在 Java 文档，即 Javadoc 中。
 
  ---------------------
  Inherited 是指继承，@Inherited 定义了一个注释与子类的关系。如果一个超类带有 @Inherited 注解，那么对于该超类，它的子类如果没有被任何注解应用的话，那么这个子类就继承了超类的注解。
 

### 8.对依赖注入的了解？
DL框架

之前：

```java
//编写代码时我们常常会发现有一些类是依赖于其它类的。所以类A可能需要一个类B的引用或对象。 ---这就是依赖 一个类 要去使用其他类相应的一些方法或属性
public class Car{

private Engine engine;

public Car(){

engine=new PetrolEngine();
}
}
```

依赖注入

```java
	
public class Car{  

    private Engine engine;

    public Car(Engine engine){

        this.engine=engine;
        }
        }
```

我们通过Car 的构造函数，向Car 传递了一个Engine 对象。

这意味着两个对象之间的耦合变低了。

Car类不需要知道 Engine 的具体实现，只要继承了原始 Engine 类，任何类型 Engine 都符合要求。
它最基本的用法就是向类中传递一个依赖，而不是直接在类中实例化。

### 9.对泛型的了解？
“泛型” 意味着编写的代码可以被不同类型的对象所重用。

### 10.静态代理和动态代理的区别？有什么场景使用？
这里看下设计模式在总结吧！！


## 线程与并发

### 1.线程和进程的区别？
线程：线程，是进程的一部分。线程有时又被称为轻权进程或轻量级进程，也是 CPU 调度的一个基本单位。线程之间共用一个进程的内存空存空间。
进程：是并发执行的程序在执行过程中分配和管理资源的基本单位
### 2.开启线程的三种方式
* 继承Thread
* 实现Runnable接口
* 实现Callable方法

### 3.如何正确的结束一个Thread?
interrupt(),这边需要再去看下《实战Java高并发程序设计》的40页

### 4.Thread 与 Runnable 的区别？
通过 ThreadEx和ThreadRun的运行
我们可以得出以下结论 
继承Thread:多个线程分别完成自己的任务，比如卖票 3个线程各自卖10张票
实现Runnable接口:多个线程共同完成一个任务 ，比如卖票 3个线程共同卖10张票

### 5.run() 与 start() 方法的区别？
start 
它的作用是启动一个新线程。
通过start()方法来启动的新线程，处于就绪（可运行）状态，并没有运行，一旦得到cpu时间片，就开始执行相应线程的run()方法，这里方法run()称为线程体，
它包含了要执行的这个线程的内容，run方法运行结束，此线程随即终止。start()不能被重复调用。用start方法来启动线程，真正实现了多线程运行，
即无需等待某个线程的run方法体代码执行完毕就直接继续执行下面的代码。这里无需等待run方法执行完毕，即可继续执行下面的代码，即进行了线程切换。


run()就和普通的成员方法一样，可以被重复调用。
如果直接调用run方法，并不会启动新线程！程序中依然只有主线程这一个线程，其程序执行路径还是只有一条，
还是要顺序执行，还是要等待run方法体执行完毕后才可继续执行下面的代码，这样就没有达到多线程的目的。

总结：调用start方法方可启动线程，而run方法只是thread的一个普通方法调用，还是在主线程里执行。

### 6.sleep() 与 wait() 方法的区别？
sleep()
正在执行的线程主动让出CPU（然后CPU就可以去执行其他任务），在sleep指定时间后CPU再回到该线程继续往下执行(注意：sleep方法只让出了CPU，而并不会释放同步资源锁！！！)

wait()方法
当前线程让自己暂时退让出同步资源锁，以便其他正在等待该资源的线程得到该资源进而运行，只有调用了notify()方法，之前调用wait()的线程才会解除wait状态，
可以去参与竞争同步资源锁，进而得到执行。（注意：notify的作用相当于叫醒睡着的人，而并不会给他分配任务，就是说notify只是让之前调用wait的线程有权利重新参与线程的调度）

总结
sleep()方法可以在任何地方使用；wait()方法则只能在同步方法或同步块中使用；（为什么wait()方法只能在同步模块使用 IllegalMonitorStateException）

sleep()是线程线程类（Thread）的方法，调用会暂停此线程指定的时间，但监控依然保持，不会释放对象锁，到时间自动恢复；wait()是Object的方法，调用会放弃对象锁，进入等待队列，
待调用notify()/notifyAll()唤醒指定的线程或者所有线程，才会进入锁池，不再次获得对象锁才会进入运行状态；

### 7.wait 与 notify 关键字的区别？
* 这边看下生产者消费者
* 为什么wait()和notify()需要搭配synchonized关键字使用

wait()方法
当一个线程在执行synchronized 的方法内部，调用了wait()后， 该线程会释放该对象的锁， 然后该线程会被添加到该对象的等待队列中（waiting queue）, 只要该线程在等待队列中， 就会一直处于闲置状态， 不会被调度执行。 要注意wait()方法会强迫线程先进行释放锁操作，所以在调用wait()时， 该线程必须已经获得锁，否则会抛出异常。由于wait()在synchonized的方法内部被执行， 锁一定已经获得， 就不会抛出异常了。

notify()
当一个线程调用一个对象的notify()方法时， 调度器会从所有处于该对象等待队列（waiting queue）的线程中取出任意一个线程， 将其添加到入口队列( entry queue) 中. 然后在入口队列中的多个线程就会竞争对象的锁， 得到锁的线程就可以继续执行。 如果等待队列中（waiting queue）没有线程， notify()方法不会产生任何作用


### 8.synchronized 关键字的用法、作用及实现原理？
* 了解线程安全，先回答什么是线程安全 --->作用
#### 用法(3种应用方式) :
* 修饰实例方法，作用于当前实例加锁，进入同步代码前要获得当前实例的锁
* 修饰静态方法，作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁
* 修饰代码块，指定加锁对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁。

针对修饰实例方法，要确保方法调用的是同一对象，才能确保线程安全
#### 作用
线程安全是并发编程中的重要关注点，应该注意到的是，造成线程安全问题的主要诱因有两点，一是存在共享数据(也称临界资源)，二是存在多条线程共同操作共享数据。
即确保相应方法同步，需要某个方法执行完才能执行其他的

#### 原理
https://blog.csdn.net/javazejian/article/details/72828483
synchronized代码块底层原理 
jvm 用monitorenter 和 monitorexit 这两个指令来确定出入口
其中monitorenter指令指向同步代码块的开始位置，monitorexit指令则指明同步代码块的结束位置，
当执行monitorenter指令时，当前线程将试图获取 objectref(即对象锁) 所对应的 monitor 的持有权，
当 objectref 的 monitor 的进入计数器为 0，那线程可以成功取得 monitor，并将计数器值设置为 1，取锁成功。
如果当前线程已经拥有 objectref 的 monitor 的持有权，那它可以重入这个 monitor (关于重入性稍后会分析)，重入时计数器的值也会加 1。倘若其他线程已经拥有 objectref 的 monitor 的所有权，那当前线程将被阻塞，直到正在执行线程执行完毕，即monitorexit指令被执行，执行线程将释放 monitor(锁)并设置计数器值为0 ，其他线程将有机会持有 monitor 。

synchronized方法底层原理
JVM可以从方法常量池中的方法表结构(method_info Structure) 中的 ACC_SYNCHRONIZED 访问标志区分一个方法是否同步方法。
当方法调用时，调用指令将会 检查方法的 ACC_SYNCHRONIZED 访问标志是否被设置，如果设置了，执行线程将先持有monitor（虚拟机规范中用的是管程一词）， 然后再执行方法，最后再方法完成(无论是正常完成还是非正常完成)时释放monitor。


### 9.volatile 关键字的用法、作用及实现原理？
### 10.transient 关键字的用法、作用及实现原理？
### 11.ReentrantLock、synchronized、volatile 之间的区别？
### 12.什么是线程池，如何使用?
### 13.多线程断点续传的实现原理？
### 14.什么是深拷贝和浅拷贝？
### 15.Java 中对象的生命周期？


