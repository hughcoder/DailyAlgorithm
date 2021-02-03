package main.剑指offer.第三阶段刷题;

public class JZ59 {
    //给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
    //输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3 //[1  3  -1]
    //输出: [3,3,5,5,6,7]
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left =0;
        int right = k-1;
        int max = -Integer.MAX_VALUE;
        int maxLeft = 0;
        int marRight =0;
        for(int i =right;i<nums.length;i++){
            int sum =0 ;
            for(int z =left;z<=right;z++){
                sum+=nums[z];
            }
            if(sum>max){
                max = sum;
                maxLeft = left;
                marRight = right;
            }
        }

        int[] target = new int[k];
        int index =0;
        while (maxLeft<marRight){
            target[index] = nums[maxLeft];
            maxLeft++;
            index++;
        }
        return target;
    }

    public static void main(String args[]) {
        JZ59 jz59 = new JZ59();
//        System.out.println(jz59.maxSlidingWindow());
    }
}
