package main.剑指offer第一轮刷题;

public class JZ37 {
    public int GetNumberOfK(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            }
        }

        return count;
    }
}
