package main.java.并发同步.threads;

// 1. 把java文件编译为class文件：javac  Test.java  (Test.java为java文件名) 生成对应的 .class 文件 Test.class
// 2.执行javap操作：javap 命令行 class文件名称（不加 .class后缀）
// javap -c SyncCodeBlock

public class SyncCodeBlock {

    public int i;

    public void syncTask(){
        //同步代码库
        synchronized (this){
            i++;
        }
    }
}

// .class文件实际是一堆二进制流 是因为编译器编译掉了

/**
 *public class main.java.并发同步.threads.SyncCodeBlock {
 public int i;

 public main.java.并发同步.threads.SyncCodeBlock();
 Code:
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return

 public void syncTask();
 Code:
 0: aload_0
 1: dup
 2: astore_1
 3: monitorenter
 4: aload_0
 5: dup
 6: getfield      #2                  // Field i:I
 9: iconst_1
 10: iadd
 11: putfield      #2                  // Field i:I
 14: aload_1
 15: monitorexit
 16: goto          24
 19: astore_2
 20: aload_1
 21: monitorexit
 22: aload_2
 23: athrow
 24: return
 Exception table:
 from    to  target type
 4    16    19   any
 19    22    19   any
 }

 */

