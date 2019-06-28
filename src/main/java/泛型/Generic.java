package main.java.泛型;

// 泛型类
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String args[]){
        Generic<Integer>  integerGeneric = new Generic<Integer>(123456);
        Generic<String> stringGeneric = new Generic<String>("aabb");
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);


        System.out.println("key is" +integerGeneric.getKey());
        System.out.println("key is" +stringGeneric.getKey());
        System.out.println("key is" +generic.getKey());
        System.out.println("key is" +generic1.getKey());
    }

}
