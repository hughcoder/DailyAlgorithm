package main.剑指offer.第三阶段刷题;

public class JZ53_2 {
    //剑指 Offer 53 - II. 0～n-1中缺失的数字
    public int missingNumber(int[] nums) {
        int target = -1;
        for(int i =0;i<nums.length;i++){
            if(i !=nums[i]){
                target = i;
                break;
            }
        }
        if(target == -1 ){
            return nums.length;
        }
        return target;
    }
}
