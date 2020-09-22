package main.剑指offer.leetcode极客第一轮;

//对应ppt12
public class Leetg874 {
    //这里需要加最大值
    public int robotSim(int[] commands, int[][] obstacles) {
        //初始从0,0开始
        int x = 0;
        int y = 0;

        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; //上右下左
        int directionIndex = 4;
        int max = 0; //初始值

        for (int i = 0; i < commands.length; i++) {
            //解析命令 方向和步数
            if (commands[i] == -1) {
                //改变方向方向 向右转90
                directionIndex = (directionIndex + 1) % 4;
            } else if (commands[i] == -2) {
                //向左转90
                directionIndex = (directionIndex + 3) % 4;
            } else {
                //走路
                int realIndex = directionIndex % 4;
                for (int k = 0; k < commands[i]; k++) {
                    //没走一步都需要判断是否碰到障碍物
                    if (obstacles.length == 0) {
                        int curIndexX = x + direction[realIndex][0];
                        int curIndexY = y + direction[realIndex][1];
                        x = curIndexX;
                        y = curIndexY;
                        max = Math.max(max,x*x+y*y);
                    } else {
                        int curIndexX = x + direction[realIndex][0];
                        int curIndexY = y + direction[realIndex][1];
                        boolean isAdd = true;
                        for (int m = 0; m < obstacles.length; m++) {
                            int curStackX = obstacles[m][0];
                            int curStackY = obstacles[m][1];

                            if (curIndexX == curStackX && curIndexY == curStackY) {
                                isAdd = false;
                            }
                        }
                        if (isAdd) {
                            x = curIndexX;
                            y = curIndexY;
                            max = Math.max(max,x*x+y*y);
                        }
                    }
                }
            }
        }
//        System.out.println("结束后的x:------>" + x);
//        System.out.println("结束后的y:------>" + y);
        return max;

    }


    public static void main(String args[]) {
        Leetg874 leetg874 = new Leetg874();
//        int[] a1 = {4, -1, 4, -2, 4};
//        int[][] b = {{2, 4}};

        int[] a1 = {-2, -1, 8, 9, 6};
        int[][] b = {{-1, 3}, {0, 1}};

        System.out.println(leetg874.robotSim(a1, b));
    }
}
