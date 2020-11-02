package main.剑指offer.leetcode极客第二轮;

public class Leetn200 {


    public int numIslands(char[][] grid) {
return 0;
    }


    public static void main(String args[]) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};


        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};


        Leetn200 leetn200 = new Leetn200();
        System.out.println(leetn200.numIslands(grid1));
        System.out.println(leetn200.numIslands(grid2));
    }
}
