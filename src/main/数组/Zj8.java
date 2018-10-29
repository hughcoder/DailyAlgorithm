package main.数组;

import java.util.ArrayList;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Zj8 {
    public void reOrderArray(int [] array) {
          ArrayList even=new ArrayList();
          ArrayList noteven = new ArrayList();
        for(int i=0,j=array.length-1;i<j;i++){
          if(isEvenNumber(array[i])){
              even.add(array[i]);
          }else {
              noteven.add(array[i]);
          }
        }
        System.out.println(even);
        System.out.println(noteven);
    }

    public boolean isEvenNumber(int num){
         if(num%2 == 0){
             return true;
         }else {
             return false;
         }
    }

    public static void main(String args[]){
        int array[] ={1,2,3,4,5,6};

    }
}
