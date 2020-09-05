package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;
import java.util.HashMap;

public class JZ54 {
    //Insert one char from stringstream
    private ArrayList<Character> charList = new ArrayList<>();

    public void Insert(char ch) {
        charList.add(ch);

    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str = "";
        for (int i = 0; i < charList.size(); i++) {
            str += charList.get(i);
        }
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (hashMap.get(str.charAt(i)) == null) {
                    hashMap.put(str.charAt(i), 1);
                } else {
                    hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
                }
            }

            for (int i = 0; i < str.length(); i++) {
                if (hashMap.get(str.charAt(i)) == 1) {
                    return str.charAt(i);
                }
            }
        }
        return '#';

    }

    public static void main(String args[]) {
        JZ54 jz54 = new JZ54();
        jz54.Insert('g');
        System.out.println(jz54.FirstAppearingOnce());
        jz54.Insert('o');
        System.out.println(jz54.FirstAppearingOnce());
        jz54.Insert('o');
        System.out.println(jz54.FirstAppearingOnce());
        jz54.Insert('g');
        System.out.println(jz54.FirstAppearingOnce());
    }


}
