package main.剑指offer.牛客第一轮刷题;

public class JZ44 {
    public String ReverseSentence(String str) {

        if(str.length() == 0){
            return str;
        }

        String[] arr = str.split(" ");

        if (arr.length <= 1) {
            return str;
        }
        String a = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            a = a + " " + arr[i];
        }
        return a;

    }

    public static void main(String args[]) {
        JZ44 jz44 = new JZ44();
        System.out.println(jz44.ReverseSentence("student. a am I"));
    }
}
