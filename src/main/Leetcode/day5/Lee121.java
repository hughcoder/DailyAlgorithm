package main.Leetcode.day5;

//输入: [7,1,5,3,6,4]
//输出: 5
public class Lee121 {

    public static int maxProfit(int[] prices) {
        int max = 0 ;
        for (int i = 1; i < prices.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(prices[i]-prices[j]>max){
                    max  = prices[i]-prices[j];
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
//        int array[]={7,1,5,3,6,4};
        int array[]={1,2};
        System.out.println(maxProfit(array));
    }
}
