package main;

public class Zj2 {
    public static int minNumberInRotateArray(int [] array) {
        int min =Integer.MAX_VALUE;
     if(array.length==0){
         return 0;
     }
     if(array.length==1){
         return array[0];
     }
     if(array.length==2){
         return array[1];
     }
     int left = 0;
     int right =array.length-1;
     int middle=0;
     while (array[left]>array[right]) {
        middle = (right-left)/2;
        if(array[middle]<array[right]){

        }
     }
     return 0;
    }
    public static void main(String args[]) {
        int array[]={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
}
