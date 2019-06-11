package main.jvm;

public class FinalizeExcapeGC {
    public static FinalizeExcapeGC SAVE_LOCK = null;

    public void isAlive() {
        System.out.println("yes, i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeExcapeGC.SAVE_LOCK = this;
    }

    public static void main(String args[]) throws InterruptedException {
        SAVE_LOCK = new FinalizeExcapeGC();
        //对象第一次成功拯救
        SAVE_LOCK = null;
        System.gc();
        //因为finalize方法优先级很低，所以暂停0.5秒以等待它
        Thread.sleep(500);
        if (SAVE_LOCK != null) {
            SAVE_LOCK.isAlive();
        } else {
            System.out.println("no,i am dead :(");
        }

        //下面这段代码完全相同 但却自救失败了
        SAVE_LOCK = null;
        System.gc();
        //因为finalize方法优先级很低，所以暂停0.5秒以等待它
        Thread.sleep(500);
        if (SAVE_LOCK != null) {
            SAVE_LOCK.isAlive();
        } else {
            System.out.println("no,i am dead :(");
        }



    }
}
