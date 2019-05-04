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
HashMap 线程不安全
Hashtable是jdk1的一个遗弃的类，它把所有方法都加上synchronized关键字来实现线程安全。所有的方法都同步这样造成多个线程访问效率特别低


### 6.对反射的了解
Java 强类型语言，但是我们在运行时有了解、修改信息的需求，包括类信息、成员信息以及数组信息。

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


### 9.对泛型的了解？

