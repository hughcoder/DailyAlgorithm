package main.剑指offer.leetcode极客第一轮;

import java.util.HashMap;

//减枝问题
public class Leeti36 {
    //判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
    //
    //数字 1-9 在每一行只能出现一次。
    //数字 1-9 在每一列只能出现一次。
    //数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
    //只要判断该数独合不合理
    //在递归中判断

    public boolean isValidSudoku(char[][] board) {
        int l = board.length;
        boolean row[][] = new boolean[l][l];
        boolean col[][] = new boolean[l][l];
        boolean boxes[][] = new boolean[l][l]; //如何把每小九个数字对应到第一个去坐标里，第二个坐标代表所在数字

        for(int i=0 ;i<board.length;i++){
            for(int j =0;j<board[i].length;j++){
               if(board[i][j] != '.'){
                   int value = board[i][j] - '1'; // 坐标是0-8 数独是1-9做个映射
                   int boxIndex = i/3*3+j/3;
                   if(row[i][value]||col[value][j]||boxes[boxIndex][value]){
                       return false;
                   }

                   row[i][value] = true;
                   col[value][j] = true;
                   boxes[boxIndex][value] = true;
               }
            }
        }

        return true;

    }

    public static void main(String args[]) {
        Leeti36 leeti36 = new Leeti36();
        char[][] test = {{'0','1','2'},{'4','5','6'},{'7','8','9'}};
        System.out.println(leeti36.isValidSudoku(test));
    }

}
