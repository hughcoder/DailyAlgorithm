package main.java基础;

public class Test1 {
    public static void main(String args[]) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

//        System.out.println(t1 == t2);
//        System.out.println(t1.equals(t2));

        int a = 1;
        int b = 1;
        String c = "aa";
        String d = "aa";
        StringBuffer e =new StringBuffer("a");
        e.append("a");
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());


        System.out.println(a == b); //T
        System.out.println(c.equals(d));//T
        System.out.println(e.toString());
        System.out.println(c.equals(e)); //F
        System.out.println(c.equals(e.toString()));//T
        System.out.println(c == e.toString());//F
        System.out.println(c == d);//T

    }
}
