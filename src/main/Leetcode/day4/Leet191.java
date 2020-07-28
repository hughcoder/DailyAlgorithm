package main.Leetcode.day4;
//191. 位1的个数

//两种算法
//1除法取整
//2.位运算
public class Leet191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for(int i =0 ;i<32;i++){
            if((n&mask) != 0){
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
}
