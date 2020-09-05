package main.剑指offer.牛客第一轮刷题;

public class JZ1 {

    public boolean Find(int target, int[][] array) {
        if (array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
