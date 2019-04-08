package main.其他;

//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Solution1 {
    public int NumberOf1(int n) {
      int count = 0;
      while (n%2!=0){
          count++;
      }
      return count;
    }
}
