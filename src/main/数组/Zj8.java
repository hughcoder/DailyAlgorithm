package main.数组;

import java.util.ArrayList;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Zj8 {
    public static void reOrderArray(int [] array) {
          ArrayList even=new ArrayList();
          ArrayList noteven = new ArrayList();
        for(int i=0,j=array.length;i<j;i++){
            System.out.println("haha"+array[i]);
          if(isEvenNumber(array[i])){
              even.add(array[i]);
          }else {
              noteven.add(array[i]);
          }
        }
        System.out.println(even);
        System.out.println(noteven);
        int[] newArray = new int[array.length];
        int index;
        for(index=0;index<noteven.size();index++){
           newArray[index]=(int)noteven.get(index);
            System.out.println("ccc"+newArray[index]);
        }
        for(int i=0;i<even.size();i++){
            newArray[index+i]=(int)even.get(i);
        }
        for(int i=0;i<newArray.length;i++){
            array[i]=newArray[i];
            System.out.println("zzzzz"+newArray[i]);
        }
    }

    public static boolean isEvenNumber(int num){
         if(num%2 == 0){
             return true;
         }else {
             return false;
         }
    }

    public static void main(String args[]){
        int array[] ={1,2,3,4,5,6,7};
       reOrderArray(array);
    }
}
