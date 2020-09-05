package main.剑指offer.牛客第一轮刷题;

public class JZ12 {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        int count = Math.abs(exponent);
        double sum =1;
        for(int i =0;i<count;i++){
            sum = sum*base;
        }

        return exponent>0?sum:1/sum;
    }
}
