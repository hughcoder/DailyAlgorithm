package main.java.泛型;

public class Genericity<T> {
    private T t;
    public Genericity(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 如果传入了泛型参数，那么编译器在传入实参的时候会进行类型检查，此时泛型才会发挥它真正的意义；
        // 如果不传入泛型参数，那么就可以传入任意类型。
        //传入泛型参数
        Genericity<String> generic = new Genericity<>("Demo");
        System.out.println(generic.getT());

        Genericity<Integer> generic1 = new Genericity<>(2223);
        System.out.println(generic1.getT());
        //不传入泛型参数
        Genericity genericity2 = new Genericity("Demo");
        System.out.println(genericity2.getT());
        Genericity genericity3 = new Genericity(23333);
        System.out.println(genericity3.getT());

    }
}
