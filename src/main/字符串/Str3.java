package main.字符串;


//请实现一个函数用来找出（字符流）中第一个只出现一次的字符。
//例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。


// 思路，首先肯定需要将每次输进去的字符流进行统计，一个字符对应个数，明显需要用hashmap， 然后还需要保存相应传入的字符串
//1。hashmap -- 保存字符串对应的个数  ， list保存字符串
//2  将保存的字符串来遍历hashmap

//参考答案使用 256数组的 到时候在看下

import java.util.ArrayList;
import java.util.HashMap;

public class Str3 {

    HashMap<Character,Integer> hashMap = new HashMap<>();
    ArrayList<Character> list = new ArrayList<Character>();

    public void Insert(char ch) {

        if(hashMap.containsKey(ch)){
            hashMap.put(ch,hashMap.get(ch)+1);
        }else {
            hashMap.put(ch,1);
        }
        list.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
     for(int i=0;i<list.size();i++){
         if(hashMap.get(list.get(i))==1){
             return list.get(i);
         }
     }
     return '#';
    }

    public static void main(String arg[]) {
    }
}
