package main.剑指offer.牛客第一轮错题;

public class JZ9 {
    // 还是不能理解   n=3 111,12,21,3(4种)         n=4   1111,211,121,112,22,31,13,4(8种)
    // f(1) = f(1-1) =1  f(2) = f(2-1)+f(2-2) = f(1)+f(0)  f(3) = f(3-1)+f(3-2)+f(3-3) = F(2)+f(1)+f(0);//(f1)+f(0) =f(2)
    // 所以  f(3) = 2*f(2);

    public int JumpFloorII(int target) {
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return 2*JumpFloorII(target -1 );
        }
    }
}
