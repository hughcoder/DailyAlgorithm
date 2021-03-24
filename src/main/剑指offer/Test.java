package main.剑指offer;

import main.剑指offer.面试遇到的.Leet168;

public class Test {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0 ){
            n=n&(n-1);
            count++;
        }
      return count;
    }

    public static void main(String args[]) {


    }
}
